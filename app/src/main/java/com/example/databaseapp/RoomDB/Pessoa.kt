package com.example.databaseapp.RoomDB

import androidx.room.Entity
import androidx.room.PrimaryKey
/*O objetivo desta classe é modelar a entidade que que será inserida no banco e seus
* repespectivos atributos*/
@Entity
data class Pessoa(
    val nome: String,
    val telefone: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
