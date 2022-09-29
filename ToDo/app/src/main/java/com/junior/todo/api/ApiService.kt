package com.junior.todo.api

import com.junior.todo.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    //response verifica se a resposta foi um sucesso e armazena dentro uma lista de categoria
    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>


}