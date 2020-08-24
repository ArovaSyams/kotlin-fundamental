package FilteringAndSorting

fun main(arg: Array<String>) {

    val myNumber = listOf<Int>(1,4,5,7,9,10,19,20)

    val predicates = {num: Int -> num > 10}         // Lambda untuk sebagai function yang dipakai berulang2 kali

    val check1 = myNumber.all (predicates)          // Return true false apakah semua yang benar apa tidak
    println(check1)

    val check2 = myNumber.any(predicates)           // return true false apakah sudah ada value yang diinginkan predikat
    println(check2)

    val check3 = myNumber.count(predicates)             // Menghitung jumlah dari kondisi yang benar
    println(check3)

    val check4 = myNumber.find(predicates)                  // Memberikan value pertama yang benar dari condition tsb.
    println(check4)

}