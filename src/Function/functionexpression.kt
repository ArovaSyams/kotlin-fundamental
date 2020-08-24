package Function

fun main(args: Array<String>) {
    var maxNum = max(10, 5)
    println("The greater number is $maxNum")

    var mixNum = mix(13, 10)
    println("The greater number is $mixNum")

    var moxNum = mox(10, 15)
    println("The greater number is $moxNum")
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }else {
        return b
    }
}

fun mix(x: Int, y: Int): Int = if (x > y) x else y

fun mox(x: Int, y: Int): Int = if (x > y) {
    println("number $x is greater")
    x
} else {
    println("number $y is greater")
    y
}