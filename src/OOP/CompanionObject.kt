package OOP

fun main(args: Array<String>) {
    MyClass.a
    MyClass.loseken()
}

class MyClass {
    companion object {              // Companion object
        var a: Int = 0

        fun loseken(): String {
            return "Indo"
        }
    }
}