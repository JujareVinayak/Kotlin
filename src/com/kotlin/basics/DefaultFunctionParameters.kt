package com.kotlin.basics

fun main(args: Array<String>) {

    println(volume(10,20))
    println(volume(10,20,50))
}
@JvmOverloads //to provide java for default parameters
fun volume(length:Int, breadth:Int, height:Int = 30):String{
    return "Volume of cube with dimensions: $length,$breadth,$height is: ${length*breadth*height}"
}