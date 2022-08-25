package com.kotlin.study.day1

import java.math.BigInteger

fun main() {
    val t = Test1()
    val a = t.plus(3, 6)
    println(a)

    val b = minus(3 , 9)
    println(b)

    val c = plus(BigInteger("3"), BigInteger("6"))
    println(c)

    val d = devide(0, 3)
    print(d)
}

class Test1 {
    fun plus(x: Int, y: Int): Int {
        return x + y
    }
}

fun minus(x: Int, y: Int): Int {
    return x - y;
}

fun plus(x: BigInteger, y:BigInteger) :BigInteger {
    return x.add(y)
}

fun devide(x: Int, y:Int):Int {
    return x / y
}


