package com.java;

import com.kotlin.basics.InterOperable;

public class InterOpKotlin {
    public static void main(String[] args) {
        System.out.println("Java called Kotlin: "+InterOperable.sum(2,3));
    }
    public static int sum(int a, int b){
        return (a+b);
    }
}
