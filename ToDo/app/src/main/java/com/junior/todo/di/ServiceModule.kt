package com.junior.todo.di

import com.junior.todo.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    //@Singleton - serve para definir que vai ser um objeto unico para o projeto
    //@Provides - indica que o objeto pode ser injetado no construtor
    //@SingletonComponent - pode ser utilizado em qualquer lugar do projeto
    @Singleton
    @Provides
    fun Returnrepository(): Repository{
        return Repository()
    }
}