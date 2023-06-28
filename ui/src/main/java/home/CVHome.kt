package home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R
import com.example.ui.theme.JiwaniCVAndroidTheme
import components.images.ImageButton
import components.images.ProfileImage

enum class ScreenType() {
    Main,
    Hugeflow,
    Ridibooks,
    Wirebarley
}

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
    Column(
        modifier = Modifier
            .padding(contentPadding),
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            ProfileImage(
                drawableId = R.drawable.linus,
                modifier = Modifier
                    .size(1024.dp)
                    .background(Color.Blue)
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 48.dp, horizontal = 16.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column {
                ImageButton(drawableId = R.drawable.hugeflow, scale = ContentScale.Fit)
                Spacer(modifier = Modifier.height(16.dp))
                ImageButton(drawableId = R.drawable.ridibooks_wide, scale = ContentScale.FillWidth)
                Spacer(modifier = Modifier.height(16.dp))
                ImageButton(drawableId = R.drawable.wirebarley_wide, scale = ContentScale.FillWidth)

            }
        }
    }
}

@Composable
@Preview(showBackground = false)
fun CVHomeContent() {
    CVHome()
}
