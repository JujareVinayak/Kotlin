package com.kotlin.basics

fun main(args: Array<String>) {
    val highOrderFunctions = HighOrderFunctions()
    highOrderFunctions.addTwoNumber(2,3,object : MyInterface{
        override fun execute(sum: String) {
            println(sum)
        }
    })
}

class HighOrderFunctions{
    fun addTwoNumber(num1: Int, num2: Int, action: MyInterface){
          action.execute("Sum of $num1 and $num2: ${num1+num2}")
    }
}

interface MyInterface{
    fun execute(sum: String)
}