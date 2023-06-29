package home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.theme.JiwaniCVAndroidTheme
import components.images.ImageButton
import components.images.ProfileImage

@Composable
fun CVHome() {
    JiwaniCVAndroidTheme {
        val scaffoldState = rememberScaffoldState()
        Scaffold(
            scaffoldState = scaffoldState,
            modifier = Modifier.statusBarsPadding()
        ) {
            CVHomeContent(it)
        }
    }
}

@Composable
fun CVHomeContent(contentPadding: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
            Image(
                bitmap = ImageBitmap.imageResource(id = R.drawable.peanuts),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )

        Column(
            modifier = Modifier
                .padding(contentPadding)
                .background(Color.Transparent),
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier.padding(32.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ProfileImage(
                        drawableId = R.drawable.linus
                    )
                    Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                        Text(text = "Name: 윤지완", fontWeight = FontWeight.Bold)
                        Text(text = "Mobile: 010-9123-3444", fontWeight = FontWeight.Bold)
                        Text(text = "Email: ryunad@gmail.com", fontWeight = FontWeight.Bold, fontSize = TextUnit(value = 15f, type = TextUnitType.Sp ))

                    }
                }
            }

            Box(
                modifier = Modifier.padding(vertical = 48.dp, horizontal = 16.dp),
            ) {
                Column {
                    ImageButton(drawableId = R.drawable.hugeflow, scale = ContentScale.Fit)
                    Spacer(modifier = Modifier.height(16.dp))
                    ImageButton(
                        drawableId = R.drawable.ridibooks_wide,
                        scale = ContentScale.FillWidth
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    ImageButton(
                        drawableId = R.drawable.wirebarley_wide,
                        scale = ContentScale.FillWidth
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = false)
fun CVHomeContent() {
    CVHome()
}
