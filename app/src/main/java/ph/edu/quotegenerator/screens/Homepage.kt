package ph.edu.quotegenerator.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import ph.edu.quotegenerator.logic.typeOfQuotes


@Composable
fun Homepage(choice: Int, onChoiceChange: (Int) -> Unit) {
    //var choice by remember { mutableStateOf(0) }
    Column {
        Text(text = "Quote of the Day")
        Text(text = typeOfQuotes.values().random().list.random())
        Button(onClick = {


            onChoiceChange(1)
        }

        ) {
            Text(text = "Love Quotes")
        }
        Button(onClick = {




            onChoiceChange(2)
        }

        ) {
            Text(text = "Inspirational Quotes")
        }
        Button(onClick = {


            onChoiceChange(3)
        }
        ) {
            Text(text = "Funny Quotes")
        }

        Button(onClick = {


            onChoiceChange(4)
        }
        ) {
            Text(text = "Favorite Quote")
        }


    }

}