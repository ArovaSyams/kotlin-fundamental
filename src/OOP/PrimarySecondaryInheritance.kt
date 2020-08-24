package OOP

fun main(args: Array<String>) {
    var apel = Apel("Merah", "Asam")

    var dosa = Berdosa("Hitam","banget")
}

open class Tumbuhan(var warna: String) {    //primary constructor
    init {
        println("primary di super class $warna")
    }
}

class Apel(warna: String, var rasa: String): Tumbuhan(warna) { //primary constructor
    init {
        println("primary di sub class $warna, $rasa")
    }
}


open class Human {

    var warna: String = ""

    constructor(warna: String) {
        this.warna = warna
        println("secondary const $warna")
    }
}

class Berdosa: Human {

    var tinggi: String = ""

    constructor(warna: String, tinggi: String) : super(warna) {
        this.tinggi = tinggi
        println("secondary const $warna $tinggi")
    }
}