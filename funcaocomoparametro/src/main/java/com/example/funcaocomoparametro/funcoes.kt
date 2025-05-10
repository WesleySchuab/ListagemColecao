package com.example.funcaocomoparametro

class Matematica {
    fun somar(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}
/*fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
}*/

//Função que recebe e executa a função
fun calcular(funcao: (Int, Int) -> Int) {
    val retorno = funcao(10, 10)
    println("Resultado = ${retorno}")
}
fun main() {
    //Função que recebe uma função
   // calcular(::somar)

    //Cria uma isntancia da classe
    val matematica = Matematica()
    //Passa o metodo para a função
    calcular(matematica::somar)

}