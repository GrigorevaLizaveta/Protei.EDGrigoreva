package ru.protei.grigorevaed.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ru.protei.grigorevaed.compose.ui.notes.NotesScreen
import ru.protei.grigorevaed.compose.ui.notes.NotesVeiwModel
import ru.protei.grigorevaed.compose.ui.theme.GrigorevaedTheme


class MainActivity : ComponentActivity() {
    private lateinit var vm: NotesVeiwModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm = NotesVeiwModel()
        setContent {
            GrigorevaedTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme. colorScheme. surface)
                {
                    NotesScreen(vm)
                }
                }
            }
        }
    }



