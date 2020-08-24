package Function

fun main(args: Array<String>) {

    medthod(lenght = 20, weight = 5, height = 10)

}

fun medthod(lenght: Int, height: Int, weight: Int = 20) {
    println("Lenght is $lenght")
    println("Height is $height")
    println("Weight is $weight")
}