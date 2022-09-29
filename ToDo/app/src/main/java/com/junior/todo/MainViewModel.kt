package com.junior.todo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.junior.todo.api.Repository
import com.junior.todo.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
        ): ViewModel() {



    private val _myCategoriaResponse = MutableLiveData<Response<List<Categoria>>>()

    val myCategoriaResponse: LiveData<Response<List<Categoria>>> = _myCategoriaResponse

    init {
//        listCategoria()
    }

    fun listCategoria(){
        viewModelScope.launch {
            try{
                val response = repository.listCategoria()
                _myCategoriaResponse.value = response
        }catch (e: Exception){
            Log.d("erro", e.message.toString())

            }        }
    }
}