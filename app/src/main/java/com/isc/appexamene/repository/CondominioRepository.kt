package com.isc.appexamene.repository

import androidx.lifecycle.LiveData
import com.isc.appexamene.data.CondominioDao
import com.isc.appexamene.model.Condominio

class CondominioRepository(private val condominioDao: CondominioDao) {

    val getAllData: LiveData<List<Condominio>> = condominioDao.getAllData()

    suspend fun deleteCondominio(condominio: Condominio) {
        condominioDao.deleteCondominio(condominio)
    }

}