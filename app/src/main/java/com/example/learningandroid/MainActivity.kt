package com.example.learningandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningandroid.ui.theme.LearningAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Brooke")
                    drawUI();
                }
            }
        }
    }
}



@Composable
fun drawUI(modifier: Modifier = Modifier) {

    val tile1 = Tile();
    val tile2 = Tile();
    val tile3 = Tile();
    val tile4 = Tile();
    val tile5 = Tile();
    val tile6 = Tile();
    val tile7 = Tile();
    val tile8 = Tile();

    Surface(color = Color.DarkGray) {
        Column() {
            Row() {
                tile1.createTile(colorT = Color.Cyan)
                tile2.createTile(colorT = Color.Green)
            }

            Row() {
                tile3.createTile(colorT = Color.Green)
                tile4.createTile(colorT = Color.Cyan)
            }

            Row() {
                tile5.createTile(colorT = Color.Cyan)
                tile6.createTile(colorT = Color.Green)
            }

            Row() {
                tile7.createTile(colorT = Color.Green)
                tile8.createTile(colorT = Color.Cyan)
            }
        }
    }
}


class Tile {

    @Composable
    fun createTile(colorT: Color, modifier: Modifier = Modifier) {

        val configuration = LocalConfiguration.current;
        val bWidth = configuration.screenWidthDp / 2;
        val bHeight = configuration.screenHeightDp / 4;

        Box (modifier = modifier
            .width(bWidth.dp)
            .height(bHeight.dp)
            .background(color = colorT)
            .border(BorderStroke(1.dp, Color.Black)))
    }
}


/**
 *  Introductory Code
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.LightGray) {
        Column {
            Text(
                text = "$name is kewl",
                fontSize = 40.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                modifier = modifier.align(CenterHorizontally)
            )
            Box(
                modifier = modifier
                    .height(50.dp)
                    .width(50.dp)
                    .background(Color.Red)
                    .align(CenterHorizontally)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearningAndroidTheme {
        drawUI();
    }
}