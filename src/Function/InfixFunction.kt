package Function

fun main(args: Array<String>) {
    val x: Int = 10
    val y: Int = 20

    println(x greatNum y)
}

infix fun Int.greatNum(great: Int): Int {
    if (this > great)
        return this
    else
        return great
}