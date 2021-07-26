package one.digitalinovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome, cpf, salario) {
    override fun calcSalario() = salario * 0.4
}