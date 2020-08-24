package OOP

fun main(args: Array<String>) {
    var cat = Cat()
    cat.color = "Black, white"
    cat.age = 10
    cat.meow()
    cat.eat()

    var dog = Dog()
    dog.breed = "Yeah breed"
    dog.color = "Black"
    dog.bark()
    dog.eat()

    var animal = Animal()
    animal.eat()
    animal.color = "Love"
}

open class Animal {
    var color: String = ""

    fun eat() {
        println("That eat")
    }

}

class Cat: Animal() {
    var age: Int = 0

    fun meow() {
        println("Meong")
    }
}

class Dog: Animal() {
    var breed: String = ""

    fun bark() {
        println("Bark like a dog")
    }
}