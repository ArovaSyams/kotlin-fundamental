package Function

fun main(args: Array<String>) {
    add()
    odd(10, 2)
    var edd = edd(5, 10)
    println("Sum of cd $edd")

    strain("Rava", "Lima belas")
}

fun add() {
    var a = 5
    var b = 4
    println("Sum is ${a + b}")
}

fun odd(x: Int, y: Int) {
    println("Sum x y is ${x + y}")
}

fun edd(c: Int, d: Int): Int {
   return c + d
}

fun strain(a: String, b: String) {
    println("My name is $a")
    println("and iam $b years old")
}