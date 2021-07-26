package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.Funcionario

class ImprimeFuncionarioTest {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}