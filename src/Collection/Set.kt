package Collection

fun main(args: Array<String>) {

    // 'set' Hanya bisa memiliki 1 jenis element

    var mySet = setOf<Int>(1,2,3,4,5,6,7,8,8,8,9,0,0,0)    //Immutable Set

    for (element in mySet) {
        println(element)
    }

    println()
    //_______________________________
    /*
    mutable set
    - mutableSetOf
    - hashSetOf
     */

    var mutableSet = hashSetOf<Int>(1,2,3,4,5,6,7,8,8,8,9,0,0,0)
    mutableSet.remove(8)
    mutableSet.add(10)

    for (element in mutableSet) {
        println(element)
    }
}