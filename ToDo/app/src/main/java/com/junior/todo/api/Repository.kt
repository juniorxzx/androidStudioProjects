package com.junior.todo.api

import com.junior.todo.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetroFitInstance.api.listCategoria()
    }
}