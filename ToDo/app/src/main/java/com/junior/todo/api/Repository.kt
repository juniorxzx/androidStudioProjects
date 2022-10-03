package com.junior.todo.api

import com.junior.todo.model.Categoria
import com.junior.todo.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetroFitInstance.api.listCategoria()
    }

    suspend fun addTarefa(tarefa: Tarefa): Response<Tarefa>{
        return RetroFitInstance.api.addTarefa(tarefa)
    }
}