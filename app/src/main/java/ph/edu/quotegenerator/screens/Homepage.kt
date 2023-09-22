package ph.edu.quotegenerator.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessAlarm
import androidx.compose.material.icons.filled.Accessibility
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.HeartBroken
import androidx.compose.material.icons.filled.SentimentVerySatisfied
import androidx.compose.material.icons.filled.TagFaces
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ph.edu.quotegenerator.logic.typeOfQuotes
import ph.edu.quotegenerator.ui.theme.QuoteGeneratorTheme


@Composable
fun Homepage(choice: Int,
             onChoiceChange: (Int) -> Unit) {
    //var choice by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.padding(40.dp))

        Text(text = "Quote of the Day",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight(10))

        Spacer(modifier = Modifier.padding(10.dp))

        Text(text = typeOfQuotes.values().random().list.random(),
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight(10))

        Spacer(modifier = Modifier.padding(30.dp))

        Button(onClick = {

            onChoiceChange(1)
        }

        ) {
            Text(text = "Love Quotes",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight(10))
            Spacer(modifier = Modifier.padding(3.dp))
            Icon(imageVector = Icons.Default.HeartBroken, contentDescription = "Love")
        }
        Button(onClick = {

            onChoiceChange(2)
        }

        ) {
            Text(text = "Inspirational Quotes",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight(10))
            Spacer(modifier = Modifier.padding(3.dp))
            Icon(imageVector = Icons.Default.AccessAlarm, contentDescription = "Inspirational")
        }
        Button(onClick = {

            onChoiceChange(3)
        }
        ) {
            Text(text = "Funny Quotes",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight(10))
            Spacer(modifier = Modifier.padding(3.dp))
            Icon(imageVector = Icons.Default.SentimentVerySatisfied, contentDescription = "Funny")
        }

        Button(onClick = {

            onChoiceChange(4)
        }
        ) {
            Text(text = "Favorite Quote",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight(10))
            Spacer(modifier = Modifier.padding(3.dp))
            Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite" )


        }
    }
}
//@Preview
//@Composable
//fun HomepagePreview() {
//    QuoteGeneratorTheme {
//        Surface{
//            Homepage(choice = 1, onChoiceChange = {})
//        }
//    }
//}