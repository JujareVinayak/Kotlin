package com.kotlin.basics

import java.math.BigInteger

/**
 * Note: tailrec is a keyword used for recursive functions. Whenever stack area fills it helps to overcome
 * stack overflow error which is more common in most of the programming languages as C, C++, Java ...
 */
fun main(args: Array<String>) {
    println(fibonacciTailRec(10000, BigInteger("0"),BigInteger("1")))//handles stack overflow
    //println(fibonacci(10000, BigInteger("0"),BigInteger("1")))// can't handle stack overflow error
}
//0 1 1 2 3 5 8 13 21 .....
tailrec fun fibonacciTailRec(n:Int, num1:BigInteger,num2:BigInteger):BigInteger = if(n==1) num1 else fibonacciTailRec(n-1,num1+num2,num1)

fun fibonacci(n:Int, num1:BigInteger,num2:BigInteger):BigInteger = if(n==1) num1 else fibonacci(n-1,num1+num2,num1)