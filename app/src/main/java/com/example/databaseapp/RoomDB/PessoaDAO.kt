package com.example.databaseapp.RoomDB

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow
/*Esta classe tem a função de estabelecer os métodos da linguagem SQL
* */
@Dao
interface PessoaDAO {

    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa)

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)

    @Query("SELECT * FROM pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>
}