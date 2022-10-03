package com.junior.todo.api

import com.junior.todo.model.Categoria
import com.junior.todo.model.Tarefa
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    //response verifica se a resposta foi um sucesso e armazena dentro uma lista de categoria
    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>


    @POST("tarefa")
    suspend fun addTarefa(
        @Body tarefa: Tarefa
    ): Response<Tarefa>
}