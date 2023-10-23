package com.example.kotlinlanguage.part4_2

import kotlin.math.*

/**
 * 실수 값 올림 내림 반올림하기
 *
 * 실수 타입의; 값을 올림 내림 반올림하는 코틀린 내장 함수에 대해 알아본다.
 */
fun main(args: Array<String>) {

    //실수 값을 올림하는 함수
    print("${ceil(3.2)}")
    print("${ceil(3.7)}")

    //실수 값을 내림하는 함수
    print("${floor(3.2)}")
    print("${floor(3.7)}")

    //실수 값을 반올림하는 함수
    print("${round(3.2)}")
    print("${round(3.7)}")

    //각각의 타입으로 반올림하는 확장 함수.
    print("${15.83.roundToInt()}")
    print("${37842.45.roundToLong()}")
}