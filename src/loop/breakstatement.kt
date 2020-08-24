package loop

fun main(args: Array<String>) {

    for (i in 1..10) {
        println(i)
        if (i == 5) {
            break
        }
    }

    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
            break@myLoop
        }
    }

}