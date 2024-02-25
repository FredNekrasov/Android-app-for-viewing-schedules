package com.schedule.ui.presentation.data_list.user


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.schedule.domain.model.User
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.special_views.CardView

@Composable
fun UserInfo(user: User?, modifier: Modifier) {
    if (user != null) {
        Box(modifier) {
            CardView(Modifier.matchParentSize(), MaterialTheme.colorScheme.tertiary, MaterialTheme.colorScheme.onTertiary)
            Column(Modifier.fillMaxSize().padding(16.dp).padding(end = 32.dp)) {
                Text("${DataStrings.userNameT}: ${user.userName}", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onTertiary, overflow = TextOverflow.Ellipsis)
                Spacer(Modifier.height(8.dp))
                Text("${DataStrings.userPassword}: ${user.password}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onTertiary, overflow = TextOverflow.Ellipsis)
                Spacer(Modifier.height(8.dp))
                Text("${DataStrings.userEmail}: ${user.email}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onTertiary, overflow = TextOverflow.Ellipsis)
            }
        }
    }
}