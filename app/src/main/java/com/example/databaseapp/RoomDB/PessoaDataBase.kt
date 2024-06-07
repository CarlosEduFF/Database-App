package com.example.databaseapp.RoomDB

import androidx.room.Database
import androidx.room.RoomDatabase
/*Esta classe é responsavel por definir o banco de dados e importar a definição da entidade
* no caso a entidade Pessoa */
@Database(
    entities = [Pessoa::class],
    version = 1
)

abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao():PessoaDAO
}