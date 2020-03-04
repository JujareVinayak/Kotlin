package com.kotlin.basics
/*
Note: var is mutable can be reassigned. val is like final can't be reassigned.
 */
import com.kotlin.basics.KotlinClassConstructors
fun main(args: Array<String>) {
    var mutableString: String = "Hii" //mutable string.
    var myInt: Int = 5
    var myChar: Char = 'j'
    var myFloat: Float = 10.0F //F is must. Should be capital F only.
    var myShort: Short = 555
    val myDouble: Double = 32.5
    val myByte: Byte = 35
    val myBoolean: Boolean = true
    val myLong: Long = 33333L
    println("mutableString: "+mutableString)
    mutableString = "I can be reassigned ..."
    println("mutableString: $mutableString")
    println("myBoolean: $myBoolean")
    println("myByte: $myByte")
    println("myChar: $myChar")
    println("myShort: $myShort")
    println("myInt: $myInt")
    println("myLong: $myLong")
    println("myFloat: $myFloat")
    println("myDouble: $myDouble")
    val immutableString = "I cannot be reassigned ..." //immutable string.
    println("immutableString: "+immutableString)

    val name: String = "Final....."
    println("name: $name")
    display(name) //function call
    var person : Person = Person() // no new keyword. Advantage over java.
    person.print("I am print function of Person class.")
    person.name = "Vinnu"
    person.print("My name is: ${person.name}") //String interpolation. Advantage over java.
    // Use $ symbol within quotes instead + outside quotes.

    var kotlinClassConstructors = KotlinClassConstructors("Vinnu",22,5.8f) //Creating a object with parameterized constructor
    kotlinClassConstructors.display()

}

fun display(name : String){ //syntax of function
println("name: $name")
}
class Person{
    var name = ""
    fun print(name : String){
        println("name: $name")
    }
}