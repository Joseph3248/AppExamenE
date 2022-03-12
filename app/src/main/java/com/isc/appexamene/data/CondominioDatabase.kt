package com.isc.appexamene.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.isc.appexamene.model.Condominio


@Database(entities = [Condominio::class], version = 1, exportSchema = false)
abstract class CondominioDatabase : RoomDatabase(){



    abstract fun condominioDao(): CondominioDao

    companion object {
        @Volatile
        private var INSTANCE: CondominioDatabase? = null

        fun getDatabase(context: android.content.Context): CondominioDatabase {

            var instance = INSTANCE
            if (instance != null) {
                return instance
            }
            synchronized(this) {


                val basedatos = Room.databaseBuilder(
                    context.applicationContext,
                    CondominioDatabase::class.java,
                    "condominio_database"
                ).build()
                INSTANCE = basedatos
                return basedatos

            }
        }

    }
}