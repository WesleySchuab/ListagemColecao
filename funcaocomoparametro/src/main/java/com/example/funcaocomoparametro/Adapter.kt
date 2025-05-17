package com.example.funcaocomoparametro

class TomadaAntiga {
    fun passarenergia() {
        println(
            "passando energia"
        )
    }
}

class conectorNovoPadrao {

}

fun main() {
    val tomadaAntiga = TomadaAntiga()
    tomadaAntiga.passarenergia()
}