package com.kotlin.basics

/**
 * Note: We can define Extension functions for both user defined classes as well as pre defined classes.
 * Adds new functions to classes: Can add functions to a class without declaring it with in class i.e, declaring outside class.
 * The extension functions added to a class behaves like static methods to that class.
 */
fun main(args: Array<String>) {
    var student = Student()
    println("Student is: ${student.hasPassed(32)} ")
    println("Student is: ${student.isScholar(53)} ")
    println("Student is: ${student.hasPassed(39)} ")
    println("Student is: ${student.isScholar(96)} ")
    var str1 = "Hello"
    var str2 = "World"
    var str3 = "Hey,"
    println(str3.add(str1,str2))
    println(5.biggest(3))
}

//Extension function which acts like static method for user defined Student class.
fun Student.isScholar(marks:Int): String = if(marks > 95) "scholar" else "not a scholar"

//Extension function which acts like static method for pre defined String class.
fun String.add(str1:String,str2:String) = "$this $str1 $str2"

//Extension function which acts like static method for pre defined Int class.
fun Int.biggest(num:Int) = if(this > num) "$this is bigger than $num" else "$num is bigger than $this"

class Student{
    fun hasPassed(marks: Int): String =  if(marks >= 35) "passed" else "failed"
}
