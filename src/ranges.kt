fun main(args: Array<String>) {
    var a = 1..5

    var b = 5 downTo 1

    var c = 5 downTo 1 step 2

    var d = 'a'..'z'

    var e = 'c' in d

    var f = 5.downTo(1)

    var g = 1.rangeTo(5)

    a.forEach {
        print("$it")
    }

    println("")
    for (i in c) {
        print("$i")
    }
}