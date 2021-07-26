package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria", cpf = "003254577", salario = 69000.0, "654")

    ImprimeFuncionarioTest.imprime(maria)

    AutenticacaoTest().autica(maria)
}