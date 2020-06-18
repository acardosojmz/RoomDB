package dev.cardoso.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface PasesalidaDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun savePasesalida(pasesalida:PasesalidaEntity)

    @Query(value = "Select * from pasesalida")
    fun getAllPasesalida() : List<PasesalidaEntity>
}