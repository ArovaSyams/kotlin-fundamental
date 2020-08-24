package OOP
fun main(args: Array<String>) {
    var user1 = User("Rava", 20)
    var user2 = User("Mana",10)

    println(user1.toString())                       //toString() = String, hashCode() = Int, equals() = Boolean

    var otherClass = user1.copy(id = 30)
    println(otherClass)



}

data class User(var name: String,var id: Int) {     // Akan berfokus pada nilai daripada onject

}