package ph.edu.quotegenerator

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ph.edu.quotegenerator.screens.Homepage
import ph.edu.quotegenerator.screens.QuoteScreen
import ph.edu.quotegenerator.ui.theme.QuoteGeneratorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var choice by mutableStateOf(0)
        val sharedPreference = getSharedPreferences("MY_PREF", Context.MODE_PRIVATE)
        var favoriteState by mutableStateOf(sharedPreference.getString("KEY_FAVORITE", null))
        setContent {

            QuoteGeneratorTheme {
                if(choice == 0){
                    Homepage(choice, onChoiceChange = { choice = it })
                }
                else{
                    QuoteScreen(choice,  onChoiceChange = { choice = it }, onFavoriteChange = {
                        sharedPreference.edit().putString("KEY_FAVORITE", it)
                        favoriteState = sharedPreference.getString("KEY_FAVORITE", null)
                    })
                }
            }
        }
    }
}

