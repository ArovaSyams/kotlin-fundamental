package Function

fun main(args: Array<String>) {
    val a: String = "Hello "
    val b: String = "World"
    var c: String = "Hey "

    println(c.add(a, b))

    val x: Int = 10
    val y: Int = 20

    println(x.greaterNum(y))

    println("Wifqo".nama)
}
// Extension Property
val String.nama: String
get() = this + "Arova"

fun String.add(s1: String, s2: String): String {
    return this + s1 + s2
}

fun Int.greaterNum(great: Int): Int {
    if (this > great)
        return this
    else
        return great
}