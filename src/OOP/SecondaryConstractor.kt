package OOP

fun main(args: Array<String>) {
    var student = Students("Arova", 20)
    println(student.id)
}

class Students(name: String){
    var id: Int = 10

    init {
        println("The name of the new student is $name")
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}