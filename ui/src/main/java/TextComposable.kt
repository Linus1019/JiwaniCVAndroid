import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui.theme.JiwaniCVAndroidTheme

@Composable
fun Greeting(text: String) {
    JiwaniCVAndroidTheme {
        Surface(modifier = Modifier) {
            Text(text = text)
        }
    }
}

@Composable
@Preview
fun PreviewGreeting() {
    Greeting("Hello World!!")
}