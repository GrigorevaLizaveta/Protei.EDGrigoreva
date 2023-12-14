package ru.protei.grigorevaed.compose.ui.notes

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import ru.protei.grigorevaed.compose.domain.Note

class NotesVeiwModel: ViewModel() {

    var selected by mutableStateOf<Note?>(null)

    val listNote = mutableStateListOf<Note>(
                Note("Моя заметка", "Мой текст")
    )

    fun OnAddetNoteClicked(){
        selected = Note("","")
        listNote.add(selected!!)
    }

    fun OnNoteChange(title: String, text: String){
        selected?.let{
            it.title = title
            it.text = text
        }
    }

    fun OnEditComplete(){
        selected = null
    }

    fun OnNoteSelected(note: Note){
        selected = note
    }
}