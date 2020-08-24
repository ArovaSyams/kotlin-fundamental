package Function

fun main(args: Array<String>) {

    var def = default(10, 10)
    println("The result $def")
    for (i in 10 until 12) {
        print("$i ")
    }


}

@JvmOverloads
fun default(length: Int, height: Int, weight: Int = 30): Int {
    return length * height * weight
}
