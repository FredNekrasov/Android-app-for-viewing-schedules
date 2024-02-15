package com.schedule.ui.presentation.data_list.pair

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.PairEntity
import com.schedule.ui.utils.special_views.CardView

@Composable
fun PairListItem(entity: PairEntity, modifier: Modifier = Modifier) {
    Box(modifier) {
        CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.error, MaterialTheme.colorScheme.onError)
        Column(Modifier.fillMaxWidth(), Arrangement.Center, Alignment.CenterHorizontally) {
            Text(entity.subject, style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onError, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween, Alignment.CenterVertically) {
                Text(entity.group, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurface, overflow = TextOverflow.Ellipsis)
                Spacer(Modifier.width(8.dp))
                Text(entity.audience, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSecondary, overflow = TextOverflow.Ellipsis)
            }
            Spacer(Modifier.height(8.dp))
            Text(entity.teacher, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onError, overflow = TextOverflow.Ellipsis)
        }
    }
}