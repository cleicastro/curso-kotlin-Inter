package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { element ->
        println("${element.name} - ${element.descricao}")
    }
}