package Percabangan

fun main (args: Array<String>) {
    val x = 5

    when (x) {
        1 -> println("X is 1")
        2 -> println("X is two")
        in 3..10 -> println("X is akeh")
        else -> {
            println("X is unknown")
            print("Let check your x")
        }
    }

    // When expression
    val str: String

    when (x) {
        1 -> str = "X is 1"
        2 -> str = "X is two"
        in 3..10 -> str = "X is akeh"
        else -> {
            str = "X is unknown"
        }
    }

    println(str)

    val a: String = when (x) {
        1 -> "X is 1"
        2 -> "X is two"
        in 3..10 -> "X is akeh"
        else -> {
            "X is unknown"
        }
    }

    println(a)


}