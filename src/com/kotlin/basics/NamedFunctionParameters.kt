package com.kotlin.basics

fun main(args: Array<String>) {
    personDetails(age = 22,height = 5.8F) //May follow sequence of parameters
    personDetails(height = 5.8F, age = 22) //Mayn't follow sequence of parameters
    personDetails(age = 22,name = "Jujare",height = 5.8F) //Can override default function parameters
    personDetails("Vinnu",height = 6F,age = 22) //No need to mention name for correct positioned parameters(here -> name)
}

fun personDetails(name:String = "Vinnu", age:Int, height:Float){
    println("name: $name, age:$age, height:$height")
}