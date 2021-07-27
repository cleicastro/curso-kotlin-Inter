package one.digitalinovation.collections

fun main() {
    val clei = Funcionario("Clei", 3556.45, "PJ")
    val ryanna = Funcionario("Ryanna", 4573.11, "CLT")
    val ryan = Funcionario("Ryan", 4157.79, "PJ")

    val funcionarios1 = setOf(clei, ryanna)
    val funcionarios2 = setOf(ryan)

    val funcionarios = funcionarios1.union(funcionarios2);
    println(funcionarios)

    println("-------------------------")
    val funcionario3 = setOf(clei, ryanna, ryan)
    val resultadoSubtract = funcionario3.subtract(funcionarios2)
    println(resultadoSubtract)

    println("-------------------------")
    val resultadoIntersect = funcionario3.intersect(funcionarios2)
    println(resultadoIntersect)
}