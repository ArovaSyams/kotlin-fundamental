import java.awt.Rectangle

fun main (args: Array<String>) {
    var name: String = "Hello"
    name = "$name World"

    println("The name is $name")

    var a = 10
    var b = 5

    println("Value of $a Ditambah $b adalah ${a + b}")

    var rect = Rectangels()
    rect.a = 10
    rect.b = 5

    println("The hasil dari ${rect.a} and the ${rect.b} is same value of ${rect.a * rect.b}")
}

class Rectangels {
    var a: Int = 0
    var b = 0
}