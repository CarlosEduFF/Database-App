package viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.databaseapp.RoomDB.Pessoa
import kotlinx.coroutines.launch

/* Esta classe se relaciona diretamente com a main
* já que requisita os métodos sql e correlaciona as respectivas entidades
* e posteriormente envia para ser exibido na main*/
class PessoaViewModel(private val repository: Repository): ViewModel() {
    fun getPessoa() = repository.getAllPessoa().asLiveData(viewModelScope.coroutineContext)

    fun upsertPessoa(pessoa: Pessoa){
        viewModelScope.launch{
            repository.upsertPessoa(pessoa)
        }
    }

    fun deletePessoa(pessoa: Pessoa){
        viewModelScope.launch{
            repository.deletePessoa(pessoa)
        }
    }
}
