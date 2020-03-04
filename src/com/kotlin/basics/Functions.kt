package com.kotlin.basics

fun main(args: Array<String>) {
    add(2,3)
    addWithUnit(2,3)
    println(addWithReturn(2,3))
}

fun add(a:Int, b:Int){//no need to define return type if return statement is not used.
    println("Sum of $a and $b is: ${a+b}")
}

fun addWithUnit(a:Int, b:Int):Unit{ //Unit is like void in java. No need to define this Unit.
    println("Sum of $a and $b is: ${a+b}")
}
fun addWithReturn(a:Int, b:Int):String{
    return "Sum of $a and $b is: ${a+b}"
}
