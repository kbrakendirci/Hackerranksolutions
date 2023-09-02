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
 * Complete the 'findMedian' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun findMedian(arr: Array<Int>): Int {
    var temp:Int
    var sortedArray = mutableListOf<Int>()
    arr.forEach {
        sortedArray.add(it)
    }


    for(i in 0.. sortedArray.size-1){
        for (j in i+1 .. sortedArray.size-1){
            if(sortedArray[j] < sortedArray[i]){
                temp = sortedArray[j]
                sortedArray[j]= sortedArray[i]
                sortedArray[i] = temp
            }
        }
    }
    var medianIndex =sortedArray.size/2
    var median = sortedArray[medianIndex]

    return median



}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = findMedian(arr)

    println(result)
}
