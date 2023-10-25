package com.example.kotlinlanguage.part4_2

import kotlin.math.abs

/**
 * Abs 함수 : 절대값 구하기
 *
 * 어떤 수의 절대값을 구하는 abs 함수에 대해 알아본다.
 */
fun main(args: Array<String>) {

    //코틀린에 내장된 abs 함수에 접근하기 위한 import 선언 후 abs에는 Double, Float, Int, Long 타입을 지원한다.
    print("${abs(-17)}")
    print("${abs(62)}")
    print("${abs(-6.34)}")
    print("${abs(1.12)}")
}