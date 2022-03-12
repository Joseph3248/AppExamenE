package com.isc.appexamene.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.isc.appexamene.model.Condominio


@Dao
interface CondominioDao {

    @Query("select * from condominio")
    fun getAllData(): LiveData<List<Condominio>>


    @Delete
    suspend fun deleteCondominio(condominio: Condominio)
}