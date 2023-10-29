package com.example.kotlinlanguage.part4_2

import kotlin.math.hypot

/**
 * Hypot 함수: 빗변의 길이 구하기
 *
 * x와 y좌표로 빗변의 길이를 구하는 함수
 */
fun main(args: Array<String>) {

    //x 제곱 + y 제곱 루트의 값을 반환한다.
    println(hypot(3.0, 4.0)) // 빗변의 길이 5.0 출력
}