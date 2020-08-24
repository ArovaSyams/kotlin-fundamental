package OOP

fun main(args:Array<String>) {

}

open class Person {
    private val a = 1       //Hanya dapat diakses di 1 kelas tersebut
    protected val b = 1     //Hanya dapat diakses di sub class tidak dapat di akses di class lain
    internal val c = 1      //Hanya dapat diakses di satu module
    public val d = 1        //Dapat diakses dimana saja
}
