@file:JvmName("InterOperable")
package com.kotlin.basics

import com.java.InterOpKotlin

fun main(args: Array<String>) {
    println("Kotlin called java: ${InterOpKotlin.sum(2,3)}")
}
fun sum(a:Int, b:Int):Int{
    return (a+b)
}