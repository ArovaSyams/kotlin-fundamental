package LambdaNHigherOrderFunction

fun main(args: Array<String>) {
    var program = Program()

    program.addTwoNum(5,5)                              // Normal execute function

    program.addTwoNum(4,5, object : MyInterface{        // Execute with interface
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val myLambda: (Int) -> Unit = {s: Int -> println(s)}        // Execute using lambda expression
    program.addTwoNum(2,8, myLambda)
}

class Program {
    fun addTwoNum(a: Int, b: Int, action: (Int) -> Unit) {             // Higher Order Function using lambda expression
        val sum = a + b
        action(sum)
    }

    fun addTwoNum(a: Int, b: Int, action: MyInterface) {             // Function with interface
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNum(a: Int, b: Int) {             // Normal function
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}