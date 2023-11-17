package com.latte.coffeeproject.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

/**
 * @author Kasmadi
 * @date 17/11/23
 */

@Composable
fun RowScope.Spacer(width: Dp) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.width(width))
}

@Composable
fun ColumnScope.Spacer(height: Dp) {
    androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(height))
}