package OOP

fun main(args: Array<String>) {
    MyStaticClass.count = 10                    // Static class tidak membutuhakan inisiasi object
    println(MyStaticClass.count)                // Static Hanya bisa dibuat sekali

    MyStaticClass.myStaticMethod()
    MyStaticClass.myMethod("Indonesia")

}

open class MySuperClass {
    open fun myMethod(str: String) {
        println("This is Super class")
    }
}

object MyStaticClass: MySuperClass() {          // Dengan keyword 'object' Kamu akan membuat static class
    var count: Int = 0                          // property termasuk static class sebagai default

    fun myStaticMethod(): String {              // Method termasuk static class sebagai default
        return "Method Indo"
    }

    override fun myMethod(str: String) {        // Meskipun berasal dari super class tapi tetap termasuk static karena telah menjadi bject class
        super.myMethod(str)
        println("My method in object class " + str)
    }

    init {                                      // Kita bisa membuat inisiasi
        // code mu
    }

}