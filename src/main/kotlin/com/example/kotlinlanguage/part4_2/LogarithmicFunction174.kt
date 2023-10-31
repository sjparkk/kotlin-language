package com.example.kotlinlanguage.part4_2

import kotlin.math.*

/**
 * 로그함수
 *
 * 코틀린에서 로그함수를 사용하는 방법을 알아본다.
 */
fun main(args: Array<String>) {

    //log base x 값을 반환
    println(log(4f, 2f)) // 2.0

    //Log2 x 값을 반환
    println(log2(8f)) // 3.0

    //log10 x값을 반환
    println(log10(10000f)) // 4.0

    //log e (x+1)의 값을 반환
    println(ln(E)) // 1.0

    //log e (e+1)의 값을 반환
    println(ln1p(E)) // 1.3132616875182228
}