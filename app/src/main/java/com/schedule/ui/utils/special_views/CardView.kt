package com.schedule.ui.utils.special_views

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CardView(
    modifier: Modifier,
    mainColor: Color,
    secondaryColor: Color,
    cornerRadius: Dp = 10.dp,
    cutCornerSize: Dp = 0.dp
) {
    Canvas(modifier){
        val clipPath = Path().apply {
            lineTo(size.width - cutCornerSize.toPx(), 0f)
            lineTo(size.width, cutCornerSize.toPx())
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            close()
        }
        clipPath(clipPath){
            drawRoundRect(color = mainColor, size = size, cornerRadius = CornerRadius(cornerRadius.toPx()))
            drawRoundRect(
                secondaryColor,
                Offset(size.width - cutCornerSize.toPx(), -100f),
                Size(cutCornerSize.toPx() + 100f, cutCornerSize.toPx() + 100f),
                CornerRadius(cornerRadius.toPx())
            )
        }
    }
}