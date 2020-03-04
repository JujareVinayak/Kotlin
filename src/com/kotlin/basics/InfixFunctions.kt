package com.kotlin.basics

/**
 * Note: Infix functions are the function with only one parameter
 * All user defined infix functions are extension functions. But all user defined extension functions are not infix functions
 * Syntax: a infixFunction b
 */
fun main(args: Array<String>) {
println("Hii" equals "Hii") //same as "Hii".equals("Hii")
    println("Hii" equals "Hello")
}

infix fun String.equals(string:String) = this == string