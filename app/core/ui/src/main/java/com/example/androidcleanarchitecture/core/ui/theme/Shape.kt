package com.example.androidcleanarchitecture.core.ui.theme

/**
 * Defines the shape system for the application.
 * These shapes are used to style components like cards, buttons, and dialogs.
 */

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp


/** Extra small rounded corner shape (4dp). Used for small components like tags. */
internal val extraSmall = RoundedCornerShape(4.dp)

/** Small rounded corner shape (8dp). Used for buttons and small cards. */
internal val small = RoundedCornerShape(8.dp)

/** Medium rounded corner shape (12dp). Used for standard cards. */
internal val medium = RoundedCornerShape(12.dp)

/** Large rounded corner shape (16dp). Used for large containers and dialogs. */
internal val large = RoundedCornerShape(16.dp)

/** Extra large rounded corner shape (24dp). Used for full-screen sheets or large interactions. */
internal val extraLarge = RoundedCornerShape(24.dp)

