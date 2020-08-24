package LambdaNHigherOrderFunction

fun main() {
    // Lambda receiver(this)
    val buildText = StringBuilder().apply {
        append("Hello ")
        append("Kotlin")
    }
    println(buildText.toString())

    // Lambda argument(it)
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    // Run
    val text1 = "Hello"
    val result = text1.run {
        val from = this
        val to = this.replace("Hello", "World")
        "This old value is $from and new value is $to"
    }
    println(result)

    //with
    val text2 = "Hello world"
    val result1 = with(text2) {
        "The value is $this" +
        "and length ${this.length}"
    }
    println(result1)

    // Let
    val text3: String? = null
    text3?.let {
        val length = it.length
        val text = "text lengt $length"
        println(text)
    } ?: run {
        println("text is null")
    }

    // Also
    val text4 = "Hello world"
    val result2 =text4.also {
        println("value length ${it.length}")
    }
    println(text4)
}