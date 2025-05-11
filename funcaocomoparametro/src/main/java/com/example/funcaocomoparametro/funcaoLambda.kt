package com.example.funcaocomoparametro

class Botao {
    fun configuirarCliquebotao(funcao: () -> Unit){
    }
}
fun executarClique(){
    println("executar clique")
}
fun main() {
    val botao = Botao()
    botao.configuirarCliquebotao (::executarClique)
// Funcao Lambda
    val funcaoLambda = { nome : String ->
        println("Executar ${nome}")
    }
    funcaoLambda("Wesley")
}