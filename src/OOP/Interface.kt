package OOP

fun main(args: Array<String>) {
    var mybtn = Mybtn()
    mybtn.onClick()
    mybtn.onTap()

}

interface MyOwnInterface {          // Tidak dpt di inisiasikan di main class
    var name: String                // Setiap property selalu anbstract default

    fun onClick()                   // jika tidak ada body..Berdefault Abstrack

    fun onTap() {                   // Jika ada body maka bersifat public open sbg default
        println("Ontap in first interface")
    }
}

interface MySecondInterface {
    fun onClick() {
        println("Onclick in second interface")
    }

    fun onTap() {
        println("Ontap in second interface")
    }
}

class Mybtn: MyOwnInterface, MySecondInterface {
    override var name: String = "Hello world"

    override fun onClick() {
        super.onClick()
    }

    override fun onTap() {
        super<MyOwnInterface>.onTap()           // Jika terdapat 2 method yang sama dalam 2 interface maka wajib diisi keterangannya
        super<MySecondInterface>.onTap()
    }
}