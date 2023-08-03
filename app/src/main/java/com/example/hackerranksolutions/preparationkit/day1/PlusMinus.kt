package com.example.hackerranksolutions.preparationkit.day1

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example
There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000

 */

fun plusMinus(arr: Array<Int>): Unit {
    var positive = 0
    var negative = 0
    var zero = 0

    for (number in arr){
        when {
            number > 0 -> positive += 1
            number < 0 -> negative += 1
            else -> zero += 1
        }
    }
    val size = arr.size.toDouble()
    println("%.6f".format(positive / size))
    println("%.6f".format(negative / size))
    println("%.6f".format(zero / size))


}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    //val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val arr = arrayOf(1,2,3,4,5)
    plusMinus(arr)
}
