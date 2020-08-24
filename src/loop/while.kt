package loop

fun main (args: Array<String>) {
    var i = 1
    while (i <= 10) {
        if (i % 2 == 0)
            println(i)
        i++
    }
}