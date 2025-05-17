package com.example.funcaocomoparametro

class TomadaAntiga(val conector: Conector) {
    fun passarenergia() {
        val qtdPinos = conector.quantidadePinos()
        if (qtdPinos == 2){
            conector.ligarAparelho()
            println("Quantidade de pinos ${qtdPinos}")
            println("passando energia")
        }else{
            println("Essa tomada só funciona com 2 pinos ${qtdPinos}")
        }

    }
}
interface  Conector{
    fun quantidadePinos() : Int
    fun ligarAparelho()

}
class ConectorNovoPadrao : Conector {

    override fun quantidadePinos() : Int{
        return 3
    }
   override fun ligarAparelho(){
        println("aparelho ligado")
    }
}

fun main() {
    val conectorNovoPadrao = ConectorNovoPadrao()
    val tomadaAntiga = TomadaAntiga(conectorNovoPadrao)
    tomadaAntiga.passarenergia()
}