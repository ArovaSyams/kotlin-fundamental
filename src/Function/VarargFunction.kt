package Function

fun main() {
    val number = sumNumber(10, 20, 30, 40)
    print(number)
}

fun sumNumber(vararg number: Int): Int {
    return number.sum()
}