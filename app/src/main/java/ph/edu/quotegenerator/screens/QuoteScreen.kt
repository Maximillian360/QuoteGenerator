package ph.edu.quotegenerator.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ph.edu.quotegenerator.logic.typeOfQuotes
import ph.edu.quotegenerator.ui.theme.QuoteGeneratorTheme
import java.time.LocalDate


@Composable
fun QuoteScreen(
    choice: Int,
    onChoiceChange: (Int) -> Unit,
    onFavoriteChange: (String?) -> Unit,
    favorite: String?,
    date: LocalDate
) {
    var buttonStateChecker = true
    when (choice) {
        1 -> {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                //var state by remember { mutableStateOf(0)}
                var stateRefresh by remember { mutableStateOf(typeOfQuotes.loveQuotes.list.random()) }
                Text(
                    text = "Love Quotes",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = stateRefresh,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                fun refresh() {
                    stateRefresh = typeOfQuotes.loveQuotes.list.random()
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    Button(
                        modifier = Modifier.weight(0.5f),
                        onClick = {
                            onChoiceChange(0)
                        }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "ArrowBack"
                        )
                    }
                    Button(modifier = Modifier.weight(0.5f),
                        onClick = {
                            refresh()

                        }) {
                        Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh")
                    }
                    Button(
                        modifier = Modifier.weight(0.5f),
                        enabled = favorite != stateRefresh,
                        onClick = {
                            onFavoriteChange(stateRefresh)
                        },
                    ) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = "favorite")
                    }
                }
            }
        }

        2 -> {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                var stateRefresh by remember { mutableStateOf(typeOfQuotes.inspireQuotes.list.random()) }
                Text(
                    text = "Inspire Quotes",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = stateRefresh,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                fun refresh() {
                    stateRefresh = typeOfQuotes.inspireQuotes.list.random()
                }
                Row(

                ) {
                    Button(modifier = Modifier.weight(0.5f),
                        onClick = {
                            onChoiceChange(0)
                        }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "ArrowBack"
                        )
                    }
                    Button(modifier = Modifier.weight(0.5f),
                        onClick = {
                            refresh()
                        }) {
                        Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh")
                    }
                    Button(
                        modifier = Modifier.weight(0.5f),
                        enabled = favorite != stateRefresh,
                        onClick = {
                            onFavoriteChange(stateRefresh)
                        },
                    ) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite")
                    }
                }
            }
        }

        3 -> {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                var stateRefresh by remember { mutableStateOf(typeOfQuotes.funnyQuotes.list.random()) }
                Text(
                    text = "Funny Quotes",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    text = stateRefresh,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )

                Spacer(modifier = Modifier.padding(10.dp))

                fun refresh() {
                    stateRefresh = typeOfQuotes.funnyQuotes.list.random()
                }
                Row(

                ) {
                    Button(modifier = Modifier.weight(0.5f),
                        onClick = {
                            onChoiceChange(0)
                        }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "ArrowBack"
                        )
                    }
                    Button(modifier = Modifier.weight(0.5f),
                        onClick = {
                            refresh()
                        }) {
                        Icon(imageVector = Icons.Default.Refresh, contentDescription = "Refresh")
                    }

                    Button(
                        modifier = Modifier.weight(0.5f),
                        enabled = favorite != stateRefresh,
                        onClick = {
                            onFavoriteChange(stateRefresh)
                        },
                    ) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = "Favorite")
                    }
                }
            }
        }

        4 -> {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Favorite Quotes",
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10)
                )
                Text(text = date.toString(),
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight(10))

                Spacer(modifier = Modifier.padding(10.dp))

                if (favorite == null) {
                    Text(
                        text = "No favorite quote yet.",
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight(10)
                    )
                } else {
                    Text(
                        text = favorite,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight(10)
                    )
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Row(

                ) {
                    Button(modifier = Modifier.weight(0.5f),
                        onClick = {
                            onChoiceChange(0)
                        }) {

                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "ArrowBack"
                        )
                    }
                    Button(modifier = Modifier.weight(0.5f),
                        enabled = favorite != null,
                        onClick = {
                            onFavoriteChange(null)
                        }) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Unfavorite"
                        )
                    }
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun QuoteScreenPreview() {
//    QuoteGeneratorTheme {
//        Surface {
//            QuoteScreen(choice = 1, onChoiceChange = {}, onFavoriteChange = {}, favorite = "", date)
//        }
//    }
//}