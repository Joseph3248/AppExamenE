package com.isc.appexamene.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "condominio")
data class Condominio(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "modelo")
    val modelo: String,
    @ColumnInfo(name = "precio")
    val precio: Double?,
    @ColumnInfo(name = "cuarto")
    val cuarto: Int?,

) : Parcelable
