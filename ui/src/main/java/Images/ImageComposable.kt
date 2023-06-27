package Images

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R

@Composable
fun ProfileImage(@DrawableRes drawableId: Int) {
    Box(
        modifier = Modifier.background(MaterialTheme.colors.background)
    ) {
        Image(
            painter = painterResource(id = drawableId),
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .border(BorderStroke(1.dp, Color.Black), CircleShape),
            contentScale = ContentScale.Inside
        )
    }
}

@Composable
@Preview
fun PreviewProfileImage() {
    ProfileImage(R.drawable.linus)
}
