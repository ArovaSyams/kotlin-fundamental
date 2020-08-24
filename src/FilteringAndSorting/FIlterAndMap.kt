package FilteringAndSorting

fun main(args: Array<String>) {

    // 'filter' Untuk memfilter data yang ada didalam array

    val myNumbers = listOf<Int>(1,3,5,6,7,8,10)
    val mySmallNum = myNumbers.filter { v -> v % 2 == 0 }

    for (num in mySmallNum) {
        println(num)
    }

    println()
    // 'map' Untuk memodifikasi data yang ada didalam array

    val mySquareNum = myNumbers.map { it * it }

    for (num in mySquareNum) {
        println(num)
    }

    println()
    // Menggabung 'map' and 'filter'

    val mySmallSquareNum = myNumbers.filter { it < 6 }.map { it * it }

    for (num in mySmallSquareNum) {
        println(num)
    }

    println()
    // Lebih jauh tentang filtering and maping

    var people = listOf<Person>(Person(10, "Tania"), Person(15, "Rava"), Person(18, "Rama"))
    var names = people.filter { person -> person.name.startsWith("R") }.map { it.name }

    for (name in names) {
        println(name)
    }

}

class Person(var age: Int, var name: String) {

}