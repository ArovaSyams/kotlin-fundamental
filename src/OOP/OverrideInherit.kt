package OOP

fun main(args: Array<String>) {
    var cat = Cats()
    cat.eats()
    println(cat.colors)

    var dog = Dogs()
    dog.eats()

}

open class Animals {
    open var colors: String = "White"

    open fun eats() {
        println("Animal eating")
    }
}

class Cats: Animals() {
    var age: Int = 0

    fun meow() {
        println("Meong")
    }

    override var colors: String = "Black"

    override fun eats() {
        super.eats()
        println("The Cat is eating")
    }
}

class Dogs: Animals() {
    var breed: String = ""

    fun bark() {
        println("Bark like a dog")
    }

    override fun eats() {
        println("The Dog is eating")
    }
}