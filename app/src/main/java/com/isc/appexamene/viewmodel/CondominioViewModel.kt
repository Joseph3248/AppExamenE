package com.isc.appexamene.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.isc.appexamene.data.CondominioDatabase
import com.isc.appexamene.model.Condominio
import com.isc.appexamene.repository.CondominioRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CondominioViewModel(application: Application) : AndroidViewModel(application) {
    val getAllData: LiveData<List<Condominio>>
    private val repository: CondominioRepository

    init {
        val condominioDao = CondominioDatabase.getDatabase(application).condominioDao()
        repository = CondominioRepository(condominioDao)
        getAllData = repository.getAllData
    }


    fun deleteCondominio(condominio: Condominio) {
        viewModelScope.launch(Dispatchers.IO) { repository.deleteCondominio(condominio) }

    }


}