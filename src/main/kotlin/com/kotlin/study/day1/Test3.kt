package com.kotlin.study.day1

fun main() {
    val a = convertAny("Hello")
    println(a)
    val b = convertAny(3)
    println(b)
    val c = convertAny("world")
    println(c)
}

fun convertAny(obj: Any): Any {
    return when (obj) {
        3 -> "tt"
        "Hello" -> {
            89 + 20
        }
        "string" -> false
        else -> {33 + 99}
    }
}

class Test3 {
}