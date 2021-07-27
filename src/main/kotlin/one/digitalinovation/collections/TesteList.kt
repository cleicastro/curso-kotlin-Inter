package one.digitalinovation.collections

fun main() {
    val clei = Funcionario("Clei", 3556.45, "PJ")
    val ryanna = Funcionario("Ryanna", 4573.11, "CLT")
    val ryan = Funcionario("Ryan", 4157.79, "PJ")

    val funcionarios = listOf(clei, ryanna, ryan)

    funcionarios.forEach {
        println(it)
    }

    println("-------------------------")
    println(funcionarios.find { it.nome == "Clei" })

    println("-------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
            Tipo de Contrato: $tipoContratacao
        """.trimIndent()
}