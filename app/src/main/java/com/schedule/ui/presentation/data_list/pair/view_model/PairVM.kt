package com.schedule.ui.presentation.data_list.pair.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.schedule.domain.model.PairEntity
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType.LOADING
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class PairVM(private val useCase: IUseCase<PairEntity>) : ViewModel() {
    private var dataMSF = MutableStateFlow(LOADING to emptyList<PairEntity>())
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
                        entity.subject.startsWith(txt) ||
                        entity.audience.startsWith(txt) ||
                        entity.group.startsWith(txt) ||
                        entity.teacher.startsWith(txt)
                    }
                }.await()
                dataMSF.emit(Pair(it.first, second))
            }
        }
    }
}