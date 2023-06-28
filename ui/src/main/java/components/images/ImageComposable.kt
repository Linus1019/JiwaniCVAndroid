package components.images

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R

@Composable
fun ProfileImage(@DrawableRes drawableId: Int, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = drawableId),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .border(border = BorderStroke(5.dp, Color.Black), shape = CircleShape)
                .clip(CircleShape),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun ImageButton(@DrawableRes drawableId: Int, modifier: Modifier = Modifier, scale: ContentScale = ContentScale.FillHeight, onClick: (() -> Unit) = {}) {
    Box(modifier = modifier.wrapContentSize(align = Alignment.Center)) {
        Image(
            painter = painterResource(id = drawableId),
            contentDescription = "",
            modifier = Modifier
                .requiredHeight(96.dp)
                .clip(RoundedCornerShape(12.dp))
                .fillMaxWidth()
                .border(BorderStroke(1.dp, Color.Black), RoundedCornerShape(12.dp))
                .clickable { onClick.invoke() },
            contentScale = scale,
        )
    }
}

@Composable
@Preview
fun PreviewProfileImage() {
    ProfileImage(R.drawable.linus)
}

@Composable
@Preview
fun PreviewImageButton() {
    Column {
        //ImageButton(drawableId = R.drawable.hugeflow, scale = ContentScale.Fit)
        ImageButton(R.drawable.ridibooks_wide)
        Spacer(modifier = Modifier.padding(8.dp))

    }
}
