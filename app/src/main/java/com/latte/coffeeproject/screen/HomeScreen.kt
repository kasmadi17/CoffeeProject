package com.latte.coffeeproject.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.latte.coffeeproject.component.Spacer
import com.latte.coffeeproject.ui.theme.CoffeeProjectTheme

/**
 * @author Kasmadi
 * @date 17/11/23
 */

@Composable
fun HomeScreen() {
    CoffeeProjectTheme {
        Scaffold(
            topBar = { HomeToolbar() }
        ) {
            HomeTimeLine(it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

@Composable
fun HomeToolbar(modifier: Modifier = Modifier) {
    OutlinedTextField(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp),
        shape = RoundedCornerShape(24.dp),
        value = "Coffee Project", onValueChange = {})
}

@Composable
fun HomeTimeLine(innerPadding: PaddingValues) {
    LazyColumn(modifier = Modifier.padding(innerPadding)) {
        repeat(10) {
            item { HomeTimeLineItem() }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeTimeLineItem() {
    val pagerState = rememberPagerState(pageCount = {
        3
    })
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        SelectionContainer {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                HorizontalPager(state = pagerState, pageSpacing = 16.dp) {
                    HomeTimeLineItemImage(url = "https://picsum.photos/400")
                }
                Spacer(height = 8.dp)
                Text(
                    text = "Coffee Project",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(height = 8.dp)
                Text(
                    text = "Jln. veteran no 1",
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(height = 4.dp)
                Text(
                    text = "Kopi enak tempat nyaman dan harga bersahabat Kopi enak tempat nyaman dan harga bersahabat",
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis

                )
                Spacer(height = 4.dp)
                Row {
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(onClick = {}) {
                        Icon(Icons.Outlined.ThumbUp, contentDescription = "")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Outlined.LocationOn, contentDescription = "")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Outlined.Info, contentDescription = "")
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun HomeTimeLineItemImage(modifier: Modifier = Modifier, url: String) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .crossfade(true)
            .build(),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(8.dp)),
        contentScale = ContentScale.Crop
    )
}

