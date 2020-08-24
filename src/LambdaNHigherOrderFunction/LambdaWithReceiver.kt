package LambdaNHigherOrderFunction

import java.lang.StringBuilder

fun main() {
    val message = buildString {
        append("Hello ")
        append("My name ")
        append("Rava")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuild = StringBuilder()
    stringBuild.action()
    return stringBuild.toString()
}