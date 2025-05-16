package com.example.funcaocomoparametro

class Botao {
    // configuirarCliquebotao recebe uma função sem parametro e sem retorno
    fun configuirarCliquebotao(funcao: () -> Unit){
    }
}
fun executarClique(){
    println("executar clique")
}
fun main() {
   val botao = Botao()

    botao.configuirarCliquebotao{
        println("Função lambda sendo passada para uma classe ")
    }

    /*
    botao.configuirarCliquebotao (::executarClique)
// Funcao Lambda
    val funcaoLambda = { nome : String ->
        println("Executar ${nome}")
    }
    funcaoLambda("Wesley")*/

}