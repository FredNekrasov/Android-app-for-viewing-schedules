package com.schedule.ui.presentation.data_list.squad

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.Squad
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.special_views.CardView

@Composable
fun GroupListItem(entity: Squad, modifier: Modifier = Modifier) {
    Box(modifier) {
        CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.outline, MaterialTheme.colorScheme.outlineVariant)
        Column(Modifier.fillMaxWidth(), Arrangement.Center, Alignment.CenterHorizontally) {
            Text("${DataStrings.shortGroupNumber}: ${entity.shortGroupNumber}", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onError, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            Text("${DataStrings.groupNumber}: ${entity.groupNumber}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onError, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text("${DataStrings.numberOfStudents}: ${entity.studentNumber}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurface, overflow = TextOverflow.Ellipsis)
        }
    }
}