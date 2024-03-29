package com.schedule.ui.presentation.data_list.teacher

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.Teacher
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.special_views.CardView

@Composable
fun TeacherListItem(entity: Teacher, modifier: Modifier = Modifier) {
    Box(modifier) {
        CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.primary, MaterialTheme.colorScheme.onPrimary)
        Column(Modifier.fillMaxWidth(), Arrangement.Center, Alignment.CenterHorizontally) {
            Text("${entity.surname} ${entity.name} ${entity.patronymic}", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            Text("${DataStrings.teacherName}: ${entity.name}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text("${DataStrings.teacherSurname}: ${entity.surname}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text("${DataStrings.teacherPatronymic}: ${entity.patronymic}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onPrimary, overflow = TextOverflow.Ellipsis)
        }
    }
}