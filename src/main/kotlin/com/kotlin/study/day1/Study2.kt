package com.kotlin.study.day1

fun main() {
    val items = listOf<String>("banana", "apple", "grape")
    for(item in items) {
        println(item)
    }

    var index = 0;
    while(index < items.size) {
        println(items[index])
        index++
    }

    println(items.indices)
    if(items.size-1 !in items.indices)
        println("dddd")


    printString(null)
    printString("aaaa")

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 4 }

    println(evenOdd.first)
    println(evenOdd.second)
    println(positives)
    println(negatives.sortedDescending())


}

fun printString(str:String?) {
    if(str != null)
        println(str)

}


class Study2 {

}