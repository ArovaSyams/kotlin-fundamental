package Function

fun main() {
    val sum = sum(10, 0, 20)
    println(sum)
}
fun sum(value1: Int, value2: Int, value3: Int): Int {
    fun validateNum(value: Int) {
        if(value == 0 ) {
            throw IllegalArgumentException("Value maust not be 0")
        }
    }
    validateNum(value1)
    validateNum(value2)
    validateNum(value3)

    return value1 + value2
}