package ph.edu.quotegenerator

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import ph.edu.quotegenerator.screens.Homepage
import ph.edu.quotegenerator.screens.QuoteScreen
import ph.edu.quotegenerator.ui.theme.QuoteGeneratorTheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var choice by mutableStateOf(0)
        val sharedPreference = getSharedPreferences("MY_PREF", Context.MODE_PRIVATE)
        var favoriteState by mutableStateOf(sharedPreference.getString("KEY_FAVORITE", null))
        var localDate by mutableStateOf(LocalDate.ofEpochDay(sharedPreference.getLong("KEY_DATE", 0)))
        setContent {

            QuoteGeneratorTheme {
                if(choice == 0){
                    Homepage(choice, onChoiceChange = { choice = it })
                }
                else{
                    QuoteScreen(choice,  onChoiceChange = { choice = it }, onFavoriteChange = {
                        sharedPreference.edit().putString("KEY_FAVORITE", it).apply()
                        favoriteState = sharedPreference.getString("KEY_FAVORITE", null)
                        sharedPreference.edit().putLong("KEY_DATE", LocalDate.now().toEpochDay()).apply()
                        localDate = LocalDate.ofEpochDay(sharedPreference.getLong("KEY_DATE", 0))
                    }, favorite = favoriteState, date = localDate)

                }
            }
        }
    }
}

