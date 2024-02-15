package com.schedule.ui.presentation.data_list.subject.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.schedule.domain.model.Subject
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType.LOADING
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SubjectVM @Inject constructor(private val useCase: IUseCase<Subject>) : ViewModel() {
    private var dataMSF = MutableStateFlow(LOADING to emptyList<Subject>())
    val data = dataMSF.asStateFlow()
    init { getList() }
    fun getData(txt: String) = if (txt.isEmpty() || txt.isBlank()) getList() else search(txt)
    private fun getList() {
        viewModelScope.launch {
            useCase.getList().collectLatest { dataMSF.emit(it) }
        }
    }
    private fun search(txt: String) {
        viewModelScope.launch {
            useCase.getList().collectLatest {
                val second = async {
                    it.second.filter { entity ->
                        entity.subjectName.startsWith(txt) ||
                        entity.lectureHours.toString().startsWith(txt) ||
                        entity.practiceHours.toString().startsWith(txt) ||
                        entity.consultationHours.toString().startsWith(txt) ||
                        entity.typeOfCertification.startsWith(txt) ||
                        entity.totalHours.toString().startsWith(txt)
                    }
                }.await()
                dataMSF.emit(Pair(it.first, second))
            }
        }
    }
}