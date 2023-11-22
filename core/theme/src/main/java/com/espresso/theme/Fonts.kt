package com.espresso.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

/**
 * @author Kasmadi
 * @date 17/11/23
 */

val fontFamily = FontFamily(
    Font(R.font.montserratlight, FontWeight.Light),
    Font(R.font.montserratregular, FontWeight.Normal),
    Font(R.font.montserratitalic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.montserratmedium, FontWeight.Medium),
    Font(R.font.montserratbold, FontWeight.Bold)
)