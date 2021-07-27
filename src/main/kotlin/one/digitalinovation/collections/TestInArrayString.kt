package one.digitalinovation.collections

fun main() {
    val names = Array<String>(3){""}
    names[0] = "Clei"
    names[1] = "Ryanna"
    names[2] = "Ryann"

    for(name in names) {
        println(name)
    }

    println("-------------------------")
    names.sort()
    names.forEach {
        println(it)
    }

    println("-------------------------")
    val names2 = arrayOf("Clei", "Ryanna", "Ryann")
    names2.sort()
    for(name in names2) {
        println(name)
    }
}