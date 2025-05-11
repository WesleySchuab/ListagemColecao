package com.example.funcaocomoparametro


fun main() {
// Funcao Lambda
    val funcaoLambda = { nome : String ->
        println("Executar ${nome}")
    }
    funcaoLambda("Wesley")
}