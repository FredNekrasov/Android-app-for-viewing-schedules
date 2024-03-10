package com.schedule.ui.presentation.data_list.pair

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.PairEntity
import com.schedule.ui.utils.special_views.CardView

@Composable
fun PairListItem(entity: PairEntity, modifier: Modifier = Modifier) {
    Box(modifier) {
        CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.primary, MaterialTheme.colorScheme.onPrimary)
        Column(Modifier.fillMaxWidth(), Arrangement.Center, Alignment.CenterHorizontally) {
            Text(entity.subject, style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceAround, Alignment.CenterVertically) {
                Text(entity.group, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
                Text(entity.audience, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            }
            Spacer(Modifier.height(8.dp))
            Text(entity.teacher, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
        }
    }
}