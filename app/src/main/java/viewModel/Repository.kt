package viewModel

import com.example.databaseapp.RoomDB.Pessoa
import com.example.databaseapp.RoomDB.PessoaDataBase

/*A presente classe estabelece funções que linka os métodos
* da classe PessoaDAO(SQL) a entidade e correlacionando o banco de dados*/
class Repository(private val db: PessoaDataBase) {

    suspend fun upsertPessoa(pessoa: Pessoa){
        db.pessoaDao().upsertPessoa(pessoa)
    }
    suspend fun deletePessoa(pessoa: Pessoa){
        db.pessoaDao().deletePessoa(pessoa)
    }
    fun getAllPessoa() = db.pessoaDao().getAllPessoa()

}