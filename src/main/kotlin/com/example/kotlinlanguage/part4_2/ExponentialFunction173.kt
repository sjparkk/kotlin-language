package com.example.kotlinlanguage.part4_2

import kotlin.math.exp
import kotlin.math.expm1
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * 지수함수
 *
 * 코틀린에서 지수함수를 사용하는 방법을 알아본다.
 */
fun main(args: Array<String>) {

    //square root(제곱근) 으로 2.0 루트 값을 반환 = 1.41421356..
    println(sqrt(2.0))

    //리시버의 x 제곱을 반환하는 확장 함수로 2.0의 0.5제곱 값을 출력
    println(2.0.pow(0.5))

    //exp 함수는 e의 x 제곱을 반환
    println(exp(2.0))

    //expm1은 e의 x제곱 -1 값을 반환한다.
    println(expm1(2.0))
}