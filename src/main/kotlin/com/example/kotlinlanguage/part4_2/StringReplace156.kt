package com.example.kotlinlanguage.part4_2

/**
 * 문자열 찾아 바꾸기
 *
 * String의 일부 문자열을 찾아 바꾸기 하는 확장 함수를 알아본다.
 */
fun main(args: Array<String>) {

    val adage = "Love begets love."


    //대소문자 무시 옵션 ignoreCase = true, oldValue를 newValue로 교체
    println(adage.replace("love", "hate", ignoreCase = true)) // hate begets hate.

    //첫번째로 일치하는 문자열을 교체
    println(adage.replaceFirst("love", "compliment", ignoreCase = true)) // compliment begets love.

    //지정한 범위의 문자열을 교체
    println(adage.replaceRange(5..10, "hello")) // Love hello love.
}