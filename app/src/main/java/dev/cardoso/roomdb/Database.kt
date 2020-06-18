package dev.cardoso.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(PasesalidaEntity::class)],version = 1)
abstract class Database : RoomDatabase() {

    abstract fun PasesalidaDao(): PasesalidaDao
}