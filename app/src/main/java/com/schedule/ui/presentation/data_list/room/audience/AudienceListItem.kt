package com.schedule.ui.presentation.data_list.room.audience

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.room.Audience
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.special_views.CardView

@Composable
fun AudienceListItem(entity: Audience, modifier: Modifier = Modifier) {
    Box(modifier) {
        CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.primary, MaterialTheme.colorScheme.onPrimary)
        Column(Modifier.fillMaxWidth(), Arrangement.Center, Alignment.CenterHorizontally) {
            Text("${DataStrings.audienceNumber}: ${entity.audienceNumber}", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            Text("${DataStrings.audienceType}: ${entity.audienceType}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text("${DataStrings.seatsNumber}: ${entity.seatsNumber}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text("${DataStrings.seatsForStudents}: ${entity.studentNumber}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
        }
    }
}