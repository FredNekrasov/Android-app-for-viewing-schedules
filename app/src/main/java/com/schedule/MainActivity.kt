package com.schedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.schedule.ui.presentation.MainScreen
import com.schedule.ui.theme.ScheduleAppTheme
import com.schedule.ui.utils.navigation.getNavItems

class MainActivity : ComponentActivity() {
    private val array = getNavItems()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScheduleAppTheme {
                Surface(Modifier.fillMaxSize(),color = MaterialTheme.colorScheme.background) {
                    MainScreen(array)
                }
            }
        }
    }
}