package com.kotlin.basics

/**
 * Note: break, continue, return are the iterators in kotlin.
 * label is like a name
 */
fun main(args: Array<String>) {

    for(i in 1..5){
        println("One for loop with break: $i")
        if(i==3)
            break //breaks out from the loop.
    }

    for(i in 1..3){
        for(j in 1..3){
            println("Multiple for loops with break: $i $j")
            if(i==2 && j==2)
                break //breaks out only from nearest for loop.
        }
    }
    /**
     * Usage of label is to break out of the labelled loop.
     */
    myForLoop@ for(i in 1..3){
        for(j in 1..3){
            println("Multiple for loops with break and label: $i $j")
            if(i==2 && j==2)
                break@myForLoop //breaks out from labelled for loop.
        }
    }

    /**Start of continue*/
    for(i in 1..10){
        if(i%2 == 0)
            continue //won't execute below statement goes to next iteration
        println("For with continue: $i")
    }

    for(i in 1..3){
        for(j in 1..3){
            if(i==2 && j==2)
                continue //won't execute below statements goes to next iteration of nearest for loop.
            println("Multiple for loops with continue: $i $j")
        }
    }

    myForLoop@ for(i in 1..3){
        for(j in 1..3){
            if(i==2 && j==2)
                continue@myForLoop //won't execute below statements goes to next iteration of labelled for loop.
            println("Multiple for loops with continue and label: $i $j")
        }
    }
}