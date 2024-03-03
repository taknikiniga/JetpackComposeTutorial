package com.taknikiniga.session1.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Error
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardComponent(
    bannerUrl: String,
    matchName: String,
    matchDate: String,
    logo: String,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp), shape = RoundedCornerShape(16.dp), onClick = {
            onClick()
        }
    ) {
        Box {

            AsyncImage(
                model = bannerUrl,
                contentDescription = "",
                modifier = Modifier.height(150.dp),
                contentScale = ContentScale.Crop
            )
            Row {
                AsyncImage(
                    model = logo,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(16.dp)
                        .width(50.dp)
                        .height(50.dp)
                )
            }
        }
        Text(
            text = matchName,
            style = TextStyle(fontWeight = FontWeight.Bold, fontFamily = FontFamily.Default),
            modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        )
        Text(text = matchDate, modifier = Modifier.padding(start = 10.dp, bottom = 10.dp))
    }

}

@Composable
fun Loader() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            CircularProgressIndicator()
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = "Please Wait..")
        }
    }
}

@Composable
fun ErrorComp(errMsg: String = "Something went wrong") {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column {
            Icon(imageVector = Icons.Rounded.Error, contentDescription = "")
            Spacer(modifier = Modifier.padding(16.dp))
            Text(text = errMsg)

        }
    }
}