package NullSafety

fun main(args: Array<String>) {

    var name: String? = null

    /*
    1. Safe call ( ?. )
    Return legth if name is not null, else return null
    */
    println("The Leght of the name is ${name?.length}")

    /*
    2. Safe Call with let ( ?.let )
    jika value nya tidak null maka akan langsung di output
    jika else maka satu blok statement tidak akan dioutput
    */
    name?.let {
        println("The Leght of the name is ${name?.length}")
    }

    /*
    3. Elvis Operator ( ?: )
    Sama seperti if else
    jika tidak null maka akan di execute yang diinginkan
    jika null maka akan mengoutput yng didefault
    */
    var panjang = name?.length ?: -1
    println("The Leght of the name is $panjang")
    /*
    4. non-null assertion operator ( !! )
    Gunakan ini jika yakin kalau tidak ada null
    akan throws NullPointerExeption jika null
     */
    println("The Leght of the name is ${name!!.length}")



}