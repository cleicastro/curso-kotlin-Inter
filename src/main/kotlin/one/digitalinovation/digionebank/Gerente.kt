package one.digitalinovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calcSalario(): Double = salario * 0.5

    override fun login(): Boolean = "123" == senha
}