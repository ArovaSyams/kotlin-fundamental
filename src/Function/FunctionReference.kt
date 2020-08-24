package Function

fun main() {
    val number = 1.rangeTo(10)
    val evenNum = number.filter(::isEvenNumber)
    println(evenNum)

    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin academy")

    println(::message.get())
}

fun isEvenNumber(value: Int) = value % 2 == 0

var message = "Kotlin"