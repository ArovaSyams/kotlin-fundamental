package OOP

fun main(args: Array<String>) {
    var student = Student("Arova")
}

class Student( name: String){
    init {
        println("The name of the new student is $name")
    }
}
