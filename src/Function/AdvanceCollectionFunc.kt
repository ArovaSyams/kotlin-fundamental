package Function

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    var drop = list.drop(3)     // dapat menggunakan dropLast
    println(drop)

    var take = list.take(3)     // Dapat menggunakan takeLast
    println(take)

    var slice = list.slice(2..4)    // mendapat nilai tertentu
    println(slice)

    var distinct = list.distinct()      //menyaring nilai yg sama
    println(distinct)

    val name = "QWERTYUIOP"
    var chunk = name.chunked(3)
    println(chunk)
}