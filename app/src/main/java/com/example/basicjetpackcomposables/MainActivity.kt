package com.example.basicjetpackcomposables

import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basicjetpackcomposables.ui.theme.BasicJetPackComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicJetPackComposablesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // var listOfName= listOf<String>("User1","User2","User3","User4")
                   // Column(modifier = Modifier.background(Color.Blue)) {
                    //    Greeting("Android")
                   //     DisplayOurText(listOfName)
                 //   }
                  //  GreetButton()
                    imageContainer()
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String,) {
    val reuseableModifier= Modifier
        .fillMaxSize()
        .background(Color.Red)
        .padding(12.dp)
        .clickable {

        }
    Text(stringResource(id = R.string.text_src),
        modifier = Modifier.verticalScroll(state = rememberScrollState()))

}
@Composable
fun Greet(){
    Box(modifier = Modifier.fillMaxSize()) {
        Text("Hello john",)
        Box(modifier = Modifier
            .align(Alignment.TopStart)
            .fillMaxHeight()
            .width(50.dp)
            .background(Color.Cyan))
        Text("world", modifier = Modifier.align(Alignment.CenterStart))
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicJetPackComposablesTheme {
        Greeting(name = "World")
    }
}

@Composable
fun GreetButton(){
    val context=LocalContext.current.applicationContext;
    Column {
        Button(onClick = {
            Toast.makeText(context,"U Clicked the button",Toast.LENGTH_SHORT).show()
        }, shape = RoundedCornerShape(size = 20.dp), colors = ButtonDefaults.buttonColors(), elevation = ButtonDefaults.buttonElevation(defaultElevation = 20.dp), modifier = Modifier
            .width(
                200.dp
            )
            .height(height = 50.dp)) {

Text(text = "Click me")
        }
    }
}

@Composable
fun imageContainer(){
    Image(painter = painterResource(id = R.drawable.earth), contentDescription = "Earth", modifier = Modifier.size(100.dp).scale(0.6f).clip(
        CircleShape).border(width = 2.dp, color = Color.Red, shape = CircleShape), contentScale = ContentScale.Crop)
}
