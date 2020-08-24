package Collection

fun main(args: Array<String>) {

    // Immutable Map, Do not be Change, tetap
    var myMap = mapOf<Int, String>(1 to "Rava", 2 to "Rama" , 3 to "Tania", 4 to "Rajha")

    for(key in myMap.keys) {
        println("The key of $key = ${myMap[key]}")
    }

    println()
    //______________________________________________

    /*
    Mutable map, can be chance terserah kita
    - hashMap
    - hashMapOf
    - mutableMapOf
     */

    var mutableMap = hashMapOf<Int, String>(5 to "Yoga")
    mutableMap.put(6, "Lala")
    mutableMap.put(7, "Lolo")

    mutableMap.replace(7, "Azizah")

    for (key in mutableMap.keys) {
        println(mutableMap[key])
    }


}