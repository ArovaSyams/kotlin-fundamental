package NullSafety

fun main(args: Array<String>) {

    var country = Country()

    //country.name = "Indonesia"
    //println(country.name)

    country.setup()
}

class Country {
    lateinit var name: String        // 'lateinit' = anda memberi janji pada data akan memberi value

    fun setup() {
        name = "Indo"
        println("The name of the country is $name")
    }
}