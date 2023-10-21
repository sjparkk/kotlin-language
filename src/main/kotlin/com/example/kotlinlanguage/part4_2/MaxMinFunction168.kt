package com.example.kotlinlanguage.part4_2

import kotlin.math.max
import kotlin.math.min

/**
 * 최대값 최소값 구하기
 *
 * 두 수의 최대 값과 최소값을 구하는 코틀린 내장 함수에 대해 알아본다.
 * 두 수의 최대 값과 최소값은 max와 min 함수로 쉽게 알아낼 수 있다.
 */
fun main(args: Array<String>) {

    //max min 이름의 함수가 여러 패키지에 선언되어 있기 때문에 kotlin.math 패키지를 import 해야만 코틀린에 내장된 max min 함수를 사용할 수 있다.
    //두 수의 최대 최소 값을 반환하면 매개변수로는 Double, Float, Int, Long 지원한다.
    println(max(3, 7))
    println(max(10.53, 1.15))
    println(min(18, 13))
    println(min(7.6, 20.01))

}