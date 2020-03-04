package com.kotlin.basics
/*
Ranges basics code.
 */
fun main(args: Array<String>){
    var r1 = 1..10 //Contains 1 to 10
    var r2 = 'a'..'z'//Contains 'a' to 'z'
    var r3 = "A".."z"//Contains "A" to "z"
    var r4 = 1..100 step 10 //1, 10, 20, ..........100
    var countDown = 100 downTo 20 //100, 80, 60, ........1
    var r6 =  100 downTo 30 step 10 //
    var moveUp = 1.rangeTo(100) // 1, 2, 3, ....100
    println("r1: $r1")
    println("r2: $r2")
    println("r3: $r3")
    println("r4: $r4")
    println("r5: $countDown")
    println("r6: $r6")
    println("J" in r3)
    println("v" in r3)
    println(60 in countDown)
}