package com.schedule.ui.presentation.data_list.date.schedule

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.date.Schedule
import com.schedule.ui.presentation.data_list.pair.PairListItem

@Composable
fun ScheduleListItem(entity: Schedule, modifier: Modifier = Modifier) {
    Box(modifier) {
        Column(modifier,Arrangement.Center,Alignment.CenterHorizontally) {
            Text(entity.dayOfWeek,Modifier.fillMaxWidth(),style = MaterialTheme.typography.titleLarge,textAlign = TextAlign.Center,color = MaterialTheme.colorScheme.primary,overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(8.dp))
            Text(entity.week.toString(),Modifier.fillMaxWidth(),style = MaterialTheme.typography.titleLarge,textAlign = TextAlign.Center,color = MaterialTheme.colorScheme.primary,overflow = TextOverflow.Ellipsis)
            Spacer(Modifier.height(16.dp))
            entity.pair1?.let { PairListItem(it,modifier) }
            Spacer(Modifier.height(8.dp))
            entity.pair2?.let { PairListItem(it,modifier) }
            Spacer(Modifier.height(8.dp))
            entity.pair3?.let { PairListItem(it,modifier) }
            Spacer(Modifier.height(8.dp))
            entity.pair4?.let { PairListItem(it,modifier) }
            Spacer(Modifier.height(8.dp))
            entity.pair5?.let { PairListItem(it,modifier) }
            Spacer(Modifier.height(8.dp))
            entity.pair6?.let { PairListItem(it,modifier) }
            Spacer(Modifier.height(8.dp))
            entity.pair7?.let { PairListItem(it,modifier) }
        }
    }
}