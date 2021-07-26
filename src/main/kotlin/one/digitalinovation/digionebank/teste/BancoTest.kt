package one.digitalinovation.digionebank.teste
import one.digitalinovation.digionebank.Banco

fun main() {
    val digibanco = Banco(nome = "Nubank", numero=23)
    println(digibanco.nome)
    println(digibanco.numero)

    val banco2 = digibanco.copy(nome = "Inter")
    println(banco2.info())

}
