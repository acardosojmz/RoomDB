package dev.cardoso.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull


@Entity(tableName = "pasesalida")
data class PasesalidaEntity (
    @PrimaryKey
    val id: Int,
    @ColumnInfo(name = "folio")
    @NotNull
    val folio: String,
    @ColumnInfo(name = "fk_id_vehiculo")
    @NotNull
    val fk_id_vehiculo: Int,
    @ColumnInfo(name = "fecha")
    @NotNull
    val fecha: String,
    @ColumnInfo(name = "fk_id_usuario")
    @NotNull
    val fk_id_usuario: Int,
    @ColumnInfo(name = "proyecto")
    @NotNull
    val proyecto: String,
    @ColumnInfo(name = "estatus")
    val estatus: String
)