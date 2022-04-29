package com.example.compose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContent {
            Column(){
                Spacer(modifier = Modifier.height(9.dp))
                Row(modifier = Modifier.padding(all = 8.dp),
                ){
                    Image(
                        painter = painterResource(id = R.drawable.sho),
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Column(
                        modifier = Modifier.padding(all = 8.dp),
                    ){
                        Spacer(modifier = Modifier.height(4.dp))
                        val msg = "Hello Word"
                        Text(msg)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Welcome to the Industry of Technology")
                    }
                }

                Spacer(modifier = Modifier.height(9.dp))
                Row(modifier = Modifier.padding(all = 8.dp),
                ){
                    Image(
                        painter = painterResource(id = R.drawable.sho),
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Column(
                        modifier = Modifier.padding(all = 8.dp),
                    ){
                        Spacer(modifier = Modifier.height(4.dp))
                        val msg = "Hello Word"
                        Text(msg)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text("Welcome to the Industry of Technology")
                    }
                }

                Card(modifier = Modifier.background(Green)) {
                    Text("Hello word", color = Blue)
                }
            }
        }
    }

}

