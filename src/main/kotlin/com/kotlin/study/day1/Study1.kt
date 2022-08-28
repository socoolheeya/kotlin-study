package com.kotlin.study.day1

import java.math.BigInteger

/**
 * 테스트
 */
fun main() {
    val t = Study1()
    val a = t.plus(3, 6)
    println(a)

    val b = minus(3 , 9)
    println(b)

    val c = plus(BigInteger("3"), BigInteger("6"))
    println(c)

    //val d = divide(3, 0)
    //println(d)

    var s:Number = 100
    val r:Number = 200
    println("s is $s")
    println("r is $r")

    s = 300
    println("re s is $s")


    println(sum(90, -300))
}

class Study1 {
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

private fun divide(x: Int, y:Int):Int {
    val result = x / y
    if(y == 0) {
        throw IllegalStateException("0으로 못나눈다구!!")
    }
    return result
}

private fun sum(x:Int, y:Int) = x + y


