package com.schedule.ui.presentation.data_list.squad

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.Squad
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.special_views.CardView

@Composable
fun GroupListItem(entity: Squad, modifier: Modifier = Modifier) {
    Box(modifier) {
        CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.onBackground, MaterialTheme.colorScheme.background)
        Column(Modifier.fillMaxWidth(), Arrangement.Center, Alignment.CenterHorizontally) {
            Text("${DataStrings.shortGroupNumber}: ${entity.shortGroupNumber}", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.background, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            Text("${DataStrings.groupNumber}: ${entity.groupNumber}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.background, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text("${DataStrings.numberOfStudents}: ${entity.studentNumber}", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.background, overflow = TextOverflow.Ellipsis)
        }
    }
}