package Collection

fun main(args: Array<String>) {

    var list = listOf<String>("Rava", "Ravka", "Rafi", "Rangga")        // Immutable list, Todak bisa di ubah2, ukuran tetap

    for (element in list) {
        println(element)
    }
    println()
    println(list)

    println()

    for (index in 0 until list.size) {
        println(list[index])
    }
    // _______________________________________
    println()
    /*
    Penggunaan keyword lain untuk mutable list
    - mutableList
    - arrayList
    - arrayListOf
     */

    var mutableList = mutableListOf<String>("Lala")            // Mutable List, Dapat di ubah2 nilainya,
    mutableList.add("CUcu")
    mutableList.add("Cica")

    mutableList.remove("CUcu")
    mutableList.add(1, "Losss")

    mutableList[2] = "Roar"

    for (element in mutableList) {
        println(element)
    }

    println()

    for (index in 0 until mutableList.size) {
        println(mutableList[index])
    }

}