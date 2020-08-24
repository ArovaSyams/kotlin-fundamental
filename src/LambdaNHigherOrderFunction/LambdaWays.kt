package LambdaNHigherOrderFunction

fun main(args: Array<String>) {

    var calculator = Calculator()

    //val myLambda: (Int, Int) -> Int = {x: Int, y: Int -> x + y}            // 1st Way use lambda expression
    //calculator.calculate(20, 5, myLambda)                                 // High order function
    //calculator.calculate(20, 4, {x: Int, y: Int -> x + y})                // 2nd Way using lambda expression
    calculator.calculate(20, 5) {x: Int, y: Int -> x + y}             // 3rd Way using lambda expression

}

class Calculator {
    fun calculate(a: Int, b: Int, lambex: (Int, Int) -> Int) {
        var result = lambex(a, b)
        println(result)
    }
}