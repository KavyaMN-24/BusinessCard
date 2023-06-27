package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardLayout()
                }
            }
        }
    }
}
@Composable
fun BusinessCardLayout(

){

        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(Color.Gray)) {

            Image(painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                Modifier.size(120.dp, 110.dp).background(Color.Black),
                alignment = Alignment.Center)
            Text(text = "Android",
                fontSize = 55.sp,
            textAlign = TextAlign.Justify)
            Text(text = "Application",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
                color = Color(0xFF3ddc84)
           )
        }
        Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.padding(10.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom) {
                Image(painter = painterResource(id = R.drawable.call_icon), contentDescription = null,
                    alignment = Alignment.Center, modifier = Modifier.size(20.dp, 20.dp)
                    )

                Text(text = "(+91)xxxxxxxxxx",
                textAlign = TextAlign.Justify
                )
            }
            Row(modifier = Modifier.padding(10.dp), horizontalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.share_icon), contentDescription = null
                , contentScale = ContentScale.Crop, modifier = Modifier.size(20.dp, 20.dp))
                Text(text = "@Android",
                    textAlign = TextAlign.Justify)

            }
            Row(modifier = Modifier.padding(10.dp), horizontalArrangement = Arrangement.Center) {
                Image(painter = painterResource(id = R.drawable.email_icon), contentDescription = null,
                contentScale = ContentScale.Crop, modifier = Modifier.size(20.dp, 20.dp))
                Text(text = "Adroid123@gmail.com",
                    textAlign = TextAlign.Justify)

            }


        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardLayout()
    }
}