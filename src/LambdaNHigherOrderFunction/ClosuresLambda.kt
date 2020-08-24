package LambdaNHigherOrderFunction

fun main(args: Array<String>) {

    var call = Call()
    var result = 0

    call.calling(10, 5) {x, y -> result = x + y}
    println(result)
}

class Call {
    fun calling(a: Int, b: Int, action: (Int, Int) -> Unit) {
        action(a, b)
    }
}