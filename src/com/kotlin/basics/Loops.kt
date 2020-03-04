package com.kotlin.basics

fun main(args: Array<String>){
    for(i in 1..10)
        println("i in for with Single statement: $i")   //Single statement without curly braces

    for(i in 1..10){     //Multiple statements with curly braces
        if(i%2 == 0)
            println("i in for with Multiple statements: $i")
    }

    var whileIncrementor = 1
    while (whileIncrementor <= 10){
        println("In while loop: $whileIncrementor")
        whileIncrementor++
    }


    var doWhileIncrementor = 1
    do {
        println("In do while: $doWhileIncrementor")
        doWhileIncrementor++
    }while (doWhileIncrementor<=10)
}