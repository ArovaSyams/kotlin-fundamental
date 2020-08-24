package Percabangan

fun main(args: Array<String>) {
    var a = 2
    var b = 5

    var maxValue: Int

    if (a > b)
        maxValue = a
        else
        maxValue = b


    println(maxValue)

    var maxValues: Int = if (a > b)
                            a
                        else
                            b

    print(maxValue)
}