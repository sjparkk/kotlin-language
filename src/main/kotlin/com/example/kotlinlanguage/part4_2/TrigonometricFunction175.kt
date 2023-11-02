package com.example.kotlinlanguage.part4_2

import kotlin.math.*

/**
 * 삼각함수
 *
 * 코틀린에서 삼각함수를 사용하는 방법을 알아본다.
 */
fun main(args: Array<String>) {

    //삼각함수의 값을 출력
    println(sin(PI/4))
    println(cos(PI/4))
    println(tan(PI/4))

    //삼각함수의 역함수 값을 출력
    println(asin(PI/4))
    println(acos(PI/4))
    println(atan(PI/4))

    //쌍곡선 함수의 값을 출력
    println(sinh(PI/4))
    println(cosh(PI/4))
    println(tanh(PI/4))

    //쌍곡선 함수의 역함수 값을 출력
    println(asinh(PI/4))
    println(acosh(PI/4))
    println(atanh(PI/4))
}