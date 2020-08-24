package loop

fun main (args: Array<String>) {

    var i: Int = 1

    do {
        println("Hello World")
        i++
    } while (i <= 10)

    var value = 'A'
    do {
        print(value)
    } while (value <= 'Z')
}