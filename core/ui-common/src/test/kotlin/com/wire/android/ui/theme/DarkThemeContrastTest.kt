/*
 * Wire
 * Copyright (C) 2024 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses/.
 */
package com.wire.android.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DarkThemeContrastTest {
    @Test
    fun darkSurfacesMeetNormalTextContrast() {
        val scheme = WireColorSchemeTypes.dark
        val backgrounds = listOf(
            scheme.background, scheme.surface, scheme.surfaceVariant,
            scheme.surfaceContainerLowest, scheme.surfaceContainerLow,
            scheme.surfaceContainer, scheme.surfaceContainerHigh, scheme.surfaceContainerHighest
        )
        backgrounds.forEach { background ->
            assertTrue(contrast(scheme.onSurface, background) >= 4.5, "Surface text must meet WCAG AA")
            assertTrue(contrast(scheme.secondaryText, background) >= 4.5, "Secondary text must meet WCAG AA")
        }
    }

    @Test
    fun darkSurfaceElevationsRemainDistinctAndOrdered() {
        val scheme = WireColorSchemeTypes.dark
        assertEquals(Color.Black, scheme.background)
        val elevations = listOf(
            scheme.surfaceContainerLowest, scheme.surfaceContainerLow, scheme.surfaceContainer,
            scheme.surfaceContainerHigh, scheme.surfaceContainerHighest
        ).map { it.luminance() }
        assertTrue(elevations.zipWithNext().all { (lower, higher) -> lower < higher })
        assertTrue(scheme.error != scheme.primary)
        assertTrue(scheme.warning != scheme.primary)
    }

    private fun contrast(foreground: Color, background: Color): Double {
        val lighter = maxOf(foreground.luminance(), background.luminance())
        val darker = minOf(foreground.luminance(), background.luminance())
        return (lighter + 0.05) / (darker + 0.05)
    }
}
