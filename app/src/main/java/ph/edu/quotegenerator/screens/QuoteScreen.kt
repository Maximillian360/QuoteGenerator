package ph.edu.quotegenerator.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import ph.edu.quotegenerator.logic.typeOfQuotes


@Composable
fun QuoteScreen(choice: Int, onChoiceChange: (Int) -> Unit, onFavoriteChange: (String) -> Unit) {
    when(choice){
        1 -> {
            Column(

            ) {
                //var state by remember { mutableStateOf(0)}
                var stateRefresh by remember {mutableStateOf(typeOfQuotes.loveQuotes.list.random()) }
                Text(text = "Love Quotes")
                Text(text = "$stateRefresh")

                fun refresh() {
                    stateRefresh = typeOfQuotes.loveQuotes.list.random()
                }

                Row (

                ) {
                    Button(onClick = {
                        onChoiceChange(0)
                    }) {


                        Text(text = "Back")
                    }
                    Button(onClick = {
                        refresh()

                    }) {


                        Text(text = "Refresh")
                    }
                    Button(onClick = {
                        onFavoriteChange(stateRefresh)
                    }) {
                        
                        Text(text = "Favorite")
                    }
                }
            }
        }
        2 -> {
            Column(

            ) {
                var stateRefresh by remember {mutableStateOf(typeOfQuotes.inspireQuotes.list.random()) }
                Text(text = "Inspire Quotes")
                Text(text = "$stateRefresh")

                fun refresh() {
                    stateRefresh = typeOfQuotes.inspireQuotes.list.random()
                }
                Row (

                ) {
                    Button(onClick = {
                        onChoiceChange(0)
                    }) {

                        Text(text = "Back")
                    }
                    Button(onClick = {
                        refresh()
                    }) {


                        Text(text = "Refresh")
                    }
                    Button(onClick = {
                        onFavoriteChange(stateRefresh)
                    }) {



                        Text(text = "Favorite")
                    }
                }
            }
        }
        3 -> {
            Column(

            ) {
                var stateRefresh by remember {mutableStateOf(typeOfQuotes.funnyQuotes.list.random()) }
                Text(text = "Funny Quotes")
                Text(text = "$stateRefresh")

                fun refresh() {
                    stateRefresh = typeOfQuotes.funnyQuotes.list.random()
                }
                Row (

                ) {
                    Button(onClick = {
                        onChoiceChange(0)
                    }) {

                        Text(text = "Back")
                    }
                    Button(onClick = {
                        refresh()
                    }) {


                        Text(text = "Refresh")
                    }
                    Button(onClick = {
                        onFavoriteChange(stateRefresh)
                    }) {



                        Text(text = "Favorite")
                    }
                }
            }
        }
        4 -> {
            Column(

            ) {
                Text(text = "Favorite Quotes")
                Text(text = "$stateRefresh")
                Row (

                ) {
                    Button(onClick = {
                        onChoiceChange(0)
                    }) {


                        Text(text = "Back")
                    }
                    Button(onClick = {


                    }) {



                        Text(text = "Unfavorite")
                    }
                }
            }
        }
    }
}