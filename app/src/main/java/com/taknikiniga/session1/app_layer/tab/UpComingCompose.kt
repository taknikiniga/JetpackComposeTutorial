package com.taknikiniga.session1.app_layer.tab

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.taknikiniga.networking.domain.model.MatchFixModel
import com.taknikiniga.session1.app_layer.pages.viewmodel.HomeVM
import com.taknikiniga.session1.ui.components.ErrorComp
import com.taknikiniga.session1.ui.components.Loader

@Composable
fun UpComingCompose(viewModel: HomeVM) {
    UpComingMatchesComp(viewModel)
}

@Composable
private fun UpComingMatchesComp(viewModel: HomeVM) {
    viewModel._upcomingMatches.value.apply {
        if (isLoading) {
            Loader()
        }

        if (hasError) {
            ErrorComp(errMsg)
        }

        if (isSuccess) {
            if (data.isNullOrEmpty()) {
                ErrorComp()
                return
            }
            LazyColumn(contentPadding = PaddingValues(16.dp)) {
                items(data!!) {

                    UpcomingCard(it)

                }
            }
        }
    }

}

@Composable
fun UpcomingCard(it: MatchFixModel.UpcomingFixture) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(1.dp),
        modifier = Modifier.padding(2.dp)
    ) {

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp)) {
            Text(text = "${it.startDateTime}")
            Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                AsyncImage(model = it.homeTeam.logoUrl, contentDescription = "", modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .clip(
                        RoundedCornerShape(5.dp)
                    ), contentScale = ContentScale.FillWidth)
                Text(text = it.homeTeam.name, modifier = Modifier.padding(start = 10.dp), style = TextStyle(fontWeight = FontWeight.Bold))
            }
            Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                AsyncImage(model = it.awayTeam.logoUrl, contentDescription = "", modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .clip(
                        RoundedCornerShape(5.dp)
                    ), contentScale = ContentScale.FillWidth)
                Text(text = it.awayTeam.name, modifier = Modifier.padding(start = 10.dp), style = TextStyle(fontWeight = FontWeight.Bold))
            }
            Text(text = it.venue.name)
        }


    }
}