package com.schedule.ui.presentation.data_list.date.semester.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.schedule.domain.model.date.Semester
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
class SemesterVM @Inject constructor(private val useCase: IUseCase<Semester>) : ViewModel() {
    private var dataMSF = MutableStateFlow(LOADING to emptyList<Semester>())
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
                        entity.semesterNumber.toString().startsWith(txt) || entity.year.toString().startsWith(txt)
                    }
                }.await()
                dataMSF.emit(it.first to second)
            }
        }
    }
}