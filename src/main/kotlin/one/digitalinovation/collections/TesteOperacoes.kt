package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(4541.56, 3644.87, 9871.23)

    println("-------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    println("-------------------------")
    val salariosFiltro = salarios.filter { it > 4500.0 }
    salariosFiltro.forEach {
        println(it)
    }

    println("-------------------------")
    println(salarios.count { it in 3500.0..10000.00 })

    println("-------------------------")
    println(salarios.find { it ==  4541.56})

    println("-------------------------")
    println(salarios.any { it ==  2500.0})
    println(salarios.any { it ==  4541.56})
}