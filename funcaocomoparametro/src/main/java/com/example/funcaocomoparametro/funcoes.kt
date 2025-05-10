package com.example.funcaocomoparametro

class funcoes {

}
fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}

//Função que recebe e executa a função
fun calcular(funcao: (Int, Int) -> Int) {
    val retorno = funcao(10, 10)
    println("Resultado = ${retorno}")
}
fun main() {
    //Função que recebe uma função
    calcular(::somar)
}