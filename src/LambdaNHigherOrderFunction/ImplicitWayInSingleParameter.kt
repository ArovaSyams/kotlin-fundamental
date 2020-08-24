package LambdaNHigherOrderFunction

fun main(args: Array<String>) {

    var loss = Loss()
    loss.lurd("Hello") {it.reversed()}              // the 'x -> y' can be replace with 'it'
}

class Loss {
    fun lurd(str: String,ler: (String) -> String) {
        var result = ler(str)
        println(result)
    }
}