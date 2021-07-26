package one.digitalinovation.collections

fun main() {
    val values = IntArray(5)
    values[0] = 7
    values[1] = 5
    values[2] = 1
    values[3] = 6
    values[4] = 2

    for(valor in values) {
        println(valor)
    }

    println("-------------------------")
    values.forEach {
        println(Int)
    }

    println("-------------------------")
    for(index in values.indices) {
        println(values[index])
    }

    println("-------------------------")
    values.sort()
    for(value in values) {
        println(value)
    }

}