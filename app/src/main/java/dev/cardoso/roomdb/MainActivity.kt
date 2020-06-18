package dev.cardoso.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(applicationContext, Database::class.java, "vehiculos").build()

        val listaPasesalida = listOf(
            PasesalidaEntity(id=1, folio= "0001",fecha="2020-06-17",fk_id_vehiculo = 1,
            fk_id_usuario = 1, proyecto = "un proyecto ficticio",estatus = ""),
            PasesalidaEntity(id=2, folio= "002",fecha="2020-06-17",fk_id_vehiculo = 334,
                fk_id_usuario = 1, proyecto = "un proyecto ficticio",estatus = "nada bueno"),
            PasesalidaEntity(id=3, folio= "003",fecha="2020-06-17",fk_id_vehiculo = 7574,
            fk_id_usuario = 1, proyecto = "un proyecto ficticio",estatus = "excelente"),
            PasesalidaEntity(id=4, folio= "004",fecha="2020-06-17",fk_id_vehiculo = 799,
            fk_id_usuario = 1, proyecto = "un proyecto ficticio",estatus = "super"),
            PasesalidaEntity(id=5, folio= "005",fecha="2020-06-17",fk_id_vehiculo =678,
            fk_id_usuario = 1, proyecto = "un proyecto ficticio",estatus = "genial"),
            PasesalidaEntity(id=6, folio= "006",fecha="2020-06-17",fk_id_vehiculo = 123,
            fk_id_usuario = 1, proyecto = "un proyecto ficticio",estatus = "para prueba")
        )


        val thread = Thread {

            //--- Inserción
            listaPasesalida.forEach { db.PasesalidaDao().savePasesalida(it)  }


            //--- recuperar
            db.PasesalidaDao().getAllPasesalida().forEach() { Log.i("Registro ", " ${it.toString()}") }
        }.start()



    }

}