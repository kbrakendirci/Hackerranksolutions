package com.example.hackerranksolutions.preparationkit.day1
/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

*/
fun timeConversion(s: String): String {
    val regex = Regex("(\\d\\d):(\\d\\d):(\\d\\d)(AM|PM)")
    val result = regex.find(s)!!
    val (hour, minute, second, amorpm) = result.destructured

    var h = hour.toInt(10)

    if (amorpm == "PM") {
        if (h != 12) {
            h += 12
        }
    } else {
        if (h == 12) {
            h = 0
        }
    }
    return "%02d:%s:%s".format(h,minute,second)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}