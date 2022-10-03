package com.junior.testepi.model

data class Tema(
    var id: Long,
    var tema: String?,
    var postagens: List<Postagem>?
        ) {


}