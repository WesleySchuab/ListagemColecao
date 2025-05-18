package com.example.funcaocomoparametro

class TomadaAntiga(val conector: Conector) {
    fun passarenergia() {
        val qtdPinos = conector.quantidadePinos()
        if (qtdPinos == 2){
            conector.ligarAparelho()
            println("Quantidade de pinos ${qtdPinos}")
            println("passando energia")
        }else{
            println("Essa tomada só funciona com 2 pinos voce passou ${qtdPinos}")
        }

    }
}
interface  Conector{
    fun quantidadePinos() : Int
    fun ligarAparelho()

}
// Adaptador que implementa a interface Conector
class ConectorAdaptador(val conectorNovoPadrao: ConectorNovoPadrao) : Conector {
    override fun quantidadePinos(): Int {
        return 2
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }

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
    // Conector adaptador recebe um conector novo padrão de 3 pinos
    val conectorAdaptador = ConectorAdaptador(conectorNovoPadrao)
    // tomada antiga recebe um conector adaptador que funciona con 2 pinos
    val tomadaAntiga = TomadaAntiga(conectorAdaptador)

    tomadaAntiga.passarenergia()
}