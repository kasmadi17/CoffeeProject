package com.latte.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.espresso.theme.CoffeeProjectTheme

/**
 * @author Kasmadi
 * @date 17/11/23
 */

@Composable
fun AuthScreen() {
    CoffeeProjectTheme {
        Auth()
    }
}

@Composable
fun Auth() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.auth_animation))
    val progress by animateLottieCompositionAsState(
        composition,
        iterations = LottieConstants.IterateForever
    )

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LottieAnimation(
            composition = composition,
            progress = { progress })
        OutlinedButton(modifier = Modifier.fillMaxWidth(), onClick = {}) {
            Text(text = "Sign in with Google")
        }

        Text(
            text = "By signing up, you agree to our Terms and Condition and acknowledge that our Privacy Policy applies to you",
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showSystemUi = true, showBackground = true, backgroundColor = 0xFFFFFfFF)
@Composable
fun AuthScreenPreview() {
    Auth()
}