package com.taknikiniga.session1.app_layer.tab

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.taknikiniga.networking.domain.model.MatchFixModel
import com.taknikiniga.session1.app_layer.pages.viewmodel.HomeVM
import com.taknikiniga.session1.ui.components.ErrorComp
import com.taknikiniga.session1.ui.components.Loader
import kotlinx.coroutines.launch

@Composable
fun LiveCompose(viewModel: HomeVM) {
    LiveMatchesComp(viewModel = viewModel)
}

@Composable
private fun LiveMatchesComp(viewModel: HomeVM) {
    viewModel._inprogressMatches.value.apply {
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
            Log.e("LiveMatchesComp: ", "${data?.size}")
            LazyColumn(contentPadding = PaddingValues(16.dp)) {
                items(data!!) {

                    CurrentMatchCom(it)

                }
            }
        }
    }

}

@Composable
fun CurrentMatchCom(it: MatchFixModel.InProgressFixture) {
    val scope = rememberCoroutineScope()
    val sb = StringBuilder()
    val sb2 = java.lang.StringBuilder()
    val sb3 = java.lang.StringBuilder()
    val sb4 = java.lang.StringBuilder()


    val (homeTeam, awayTeam) = it.innings.partition { innings ->
        it.homeTeamId == innings.battingTeamId
    }

    homeTeam.forEach { inning ->
        if (sb.toString() != "") {
            sb.append(" & ")
            sb3.append(" & ")
        }
        if (inning.isDeclared) {
            sb.append(inning.numberOfWicketsFallen)
            sb.append("d-")
            sb.append(inning.runsScored)
        } else {
            sb.append(inning.numberOfWicketsFallen)
            sb.append("-")
            sb.append(inning.runsScored)
        }
        sb3.append(inning.oversBowled)
    }

    awayTeam.forEach { inning ->
        if (sb2.toString() != "") {
            sb2.append(" & ")
            sb4.append(" & ")
        }
        if (inning.isDeclared) {
            sb2.append(inning.numberOfWicketsFallen)
            sb2.append("d-")
            sb2.append(inning.runsScored)
        } else {
            sb2.append(inning.numberOfWicketsFallen)
            sb2.append("-")
            sb2.append(inning.runsScored)
        }
        sb4.append(inning.oversBowled)
    }



    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.padding(5.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {


        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = it.name,
                    modifier = Modifier.fillMaxWidth(0.50f),
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold)
                )
                Text(
                    text = it.gameStatus,
                    modifier = Modifier
                        .fillMaxWidth(0.50f)
                        .background(Color.Gray),
                    textAlign = TextAlign.Center, style = TextStyle(fontSize = 14.sp),

                    )
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Team One
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(text = it.homeTeam.shortName ?: "Home")
                    Spacer(modifier = Modifier.padding(3.dp))
                    AsyncImage(
                        model = it.homeTeam.logoUrl, contentDescription = "", modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(RoundedCornerShape(10.dp)), contentScale = ContentScale.Crop

                    )
                }

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "$sb",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier
                            .padding(start = 5.dp, end = 5.dp)
                            .fillMaxWidth(0.20f)
                    )
                    Text(
                        text = "($sb3)",
                        style = TextStyle(fontSize = 10.sp)
                    )
                }

                Text(text = "VS")


                /**
                 * Away Team Score
                 */


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    /**
                     *  Away Score Board
                     */


                    Text(
                        text = "$sb2",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        ),
                        modifier = Modifier
                            .padding(start = 5.dp, end = 10.dp)
                            .fillMaxWidth(0.20f)
                    )
                    Text(
                        text = "($sb4)",
                        style = TextStyle(fontSize = 10.sp)
                    )
                }

                // Team Two
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(end = 10.dp)
                ) {
                    Text(text = it.awayTeam.shortName ?: "Away")
                    Spacer(modifier = Modifier.padding(3.dp))
                    AsyncImage(
                        model = it.awayTeam.logoUrl, contentDescription = "",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.Crop,
                    )
                }

            }

            Spacer(modifier = Modifier.padding(8.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = it.gameType,
                    modifier = Modifier
                        .background(Color.Gray)
                        .padding(5.dp),
                    style = TextStyle(
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
                Text(
                    text = it.resultText,
                    textAlign = TextAlign.Center,
                    style = TextStyle(fontSize = 10.sp),
                    modifier = Modifier.padding(10.dp)
                )

            }

        }
    }


}