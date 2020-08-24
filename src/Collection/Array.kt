package Collection

fun main(args: Array<String>) {

    var myArray = Array<Int>(5) {0}     // Mutable list
    myArray[0] = 10
    myArray[3] = 19
    myArray[4] = 30

    println(myArray[0])

    println()

    for (element in myArray) {
        println(element)
    }

    println()

    for (index in 0..4) {
        println(myArray[index])
    }
}