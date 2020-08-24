package NullSafety

val pi: Float by lazy { 3.14f }     // Mengefisiensikan penggunaan memori
                                    // Jika tidak diinisiasikan maka tidak ada penggunaan memory yang keluar

fun main(args: Array<String>) {
    var result = pi * 3 * 4
    var result2 = pi * 2 * 3        // Jika sudah mengunakan yang kedua maka akan menggunakan memory yang sama.. tidak menambah mempry
}