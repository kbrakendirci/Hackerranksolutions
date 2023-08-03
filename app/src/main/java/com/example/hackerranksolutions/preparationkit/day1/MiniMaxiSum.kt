package com.example.hackerranksolutions.preparationkit.day1

import android.util.Log
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
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var sum = 0L
    var minNumber = Int.MAX_VALUE
    var maxNumber = 0

    for(i in arr){
        sum +=i
        if (i > maxNumber)  maxNumber = i
        if (i < minNumber )  minNumber = i
    }

    println("${sum - maxNumber} ${sum - minNumber}")

}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
