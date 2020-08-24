package OOP

fun main(args: Array<String>) {
    var rawan = Rawan()
    rawan.eat()
}

abstract class Orang {          // Tidak dapat di inisiasikan di main fun
    abstract var num: String    // Abstract harus kosong tak bernilai, harus di impementasikan ke sub class, harus di inisiasikan di dalam abstract class
    abstract fun eat()          // Bersifat "open" default
    open fun love() {}
    fun miss() {}               // Bersifat public final sbg default
}

class Rawan: Orang() {
    override var num: String = "My name Rava"   // Harus mencantumkan nilai

    override fun eat() {
        println("I want to eat your pankreas")
    }


}