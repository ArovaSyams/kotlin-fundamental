fun main() {
    val colors: Array<Color> = enumValues()
    colors.forEach {
        color -> println(color)
    }

    val color: Color = enumValueOf("REDD")
    println("COLOR is $color")

}

enum class Color(val value: Int) {
    REDD(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}