package com.kotlin.study.day1


fun main() {
    var fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    println(fruits)
    fruits = fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .toCollection(ArrayList())


    println(fruits)

    val x = "test"
    val parse = parseInt(x)
    println(parse)


    val test = testIf(1)
    println(test)

    val aa = arrayOfMinusOnes(4)
    for(a in aa) {
        println(a)
    }


    var a = 1
    var b = 2
    a = b.also { b = a }

    println(a)
    println(b)


    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(10 times "Bye ")

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    infix fun String.to(value: String) = Pair(this, value)
    val testPair = "key1" to "value1"
    println(testPair)
    println(testPair.first)


    val r = calculate(10, 15, ::sum)
    println(r)
    val r2 = calculate(10, 2, ::divide)
    println(r2)

    val tt = myFormatter("aaa", "bbb", "ccc", "ddd")
    println(myFormatter(d="ddddd", b="5555", a="11111", c="009999"))

}

fun myFormatter(a: String, b: String, c: String, d: String) = "$a$b$c$d"

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

private fun sum(x: Int, y: Int) = x + y
private fun divide(x: Int, y: Int): Int {
    return x / y
}


fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun testIf(x: Int? = 0): Any {
    var y = if (x == 1) {
        "one"
    } else if (x == 2) {
        "two"
    } else {
        "other"
    }
    return y
}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}


class Study4 {



}