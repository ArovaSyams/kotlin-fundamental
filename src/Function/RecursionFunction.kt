package Function

import java.math.BigInteger

fun main(args: Array<String>) {
    println(fibonanciNum(10, BigInteger("1"), BigInteger("0")))

}

tailrec fun fibonanciNum(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0)
        return b
    else
        return fibonanciNum(n-1,a + b, a)
}
