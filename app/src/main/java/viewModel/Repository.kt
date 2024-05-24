package viewModel

import com.example.databaseapp.RoomDB.Pessoa
import com.example.databaseapp.RoomDB.PessoaDataBase

class Repository(private val db: PessoaDataBase) {

    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }
    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }
    fun getAllPessoa() = db.pessoaDao().getAllPessoa()

}