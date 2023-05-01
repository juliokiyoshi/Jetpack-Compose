package com.example.composetutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    WellnessScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(modifier = Modifier.padding(all = 10.dp)) {
        Image(
            painter = painterResource(R.drawable.vector),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .border(1.dp, MaterialTheme.colors.secondaryVariant, CircleShape)
        )
        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text(
                text = "MY FIRST APP IN COMPOSE $name!",
                color = MaterialTheme.colors.secondaryVariant,
                style = MaterialTheme.typography.subtitle2
            )
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(10.dp))
            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(

                    text = "meu novo app com Compose",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(horizontal = 10.dp),
                    color = MaterialTheme.colors.primary,
                    style = MaterialTheme.typography.body2

                )
            }
        }

    }
}

@Preview(showBackground = true)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "dark Mode"
)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        Greeting("Android")
    }
}