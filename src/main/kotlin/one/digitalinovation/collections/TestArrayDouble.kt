package one.digitalinovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 2543.55
    salarios[1] = 3213.24
    salarios[2] = 1693.65

    for (salario in salarios) {
        println(salarios)
    }

    println("-------------------------")
    salarios.sort()
    salarios.forEach {
        println(it)
    }

    println("-------------------------")
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-------------------------")
    val salario2 = doubleArrayOf(1544.45, 3657.36, 1547.99)
    salario2.sort()
    for (salario in salario2) {
        println(salario)
    }
}