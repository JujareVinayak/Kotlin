package com.kotlin.basics

fun main(args: Array<String>) {
    var a = 10
    var b = 20
    var biggest = if(a>b) // If Single statement without {} symbols.
                    a
                  else
                  true // Multiple return type if type of result not declared.
    println("Biggest: $biggest")
    var smallest: Int
    smallest = if(a<b){ //If Multiple statements with {} symbols.
        println("a is smallest")
        a
    }else{
        println("b is smallest")
        b
    }

    val x = 35
    when(x){ //when is similar to switch in java. Matches and executes first valid case only.
        in 1..10 -> println("x lies between 1 to 10")
        1 -> println("x is 1")
        2,3 -> println("x is 2 or 3")
        else -> { //else is similar to default. Note that there is no break keyword. You can multiple statements using {}
            println("x is unknown")
            println("Not present in above cases")
        }
    }
    val c = when(x){
        in 1..10 -> "x lies between 1 to 10"
        1 -> "x is 1"
        else -> 1
    }
    println("c: $c")

}