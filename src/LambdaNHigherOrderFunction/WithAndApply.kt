package LambdaNHigherOrderFunction

fun main(args: Array<String>) {

    var person = Person()

    with(person) {
        name = "Rava"
        age = 15
    }

    person.apply {
        name = "Ravva"
        age = 16
    }.startRun()

}

class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("now i am start to run")
    }
}