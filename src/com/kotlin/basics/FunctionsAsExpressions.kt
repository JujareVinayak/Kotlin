package com.kotlin.basics

fun main(args: Array<String>) {
var biggest = biggest(3,5)
    println(biggest)
    println(big(35,53))
}
/**Normal function*/
fun biggest(a: Int, b: Int):String{
    return if(a>b)
        ("a:$a is bigger than b:$b")
    else
        ("b:$b is bigger than a:$a")
}

/**Above normal function as expression*/
fun big(a: Int,b: Int): String = if(a>b) ("a:$a is bigger than b:$b") else ("b:$b is bigger than a:$a")