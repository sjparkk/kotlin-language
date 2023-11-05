package com.example.kotlinlanguage.part4_2

/**
 * toBits, toRawBits 확장함수
 *
 * 실수 값의 이진수 배열 형태를 알아내는 방법을 배운다.
 * toBits, toRawBits 확장 함수를 이용하면 실수 값이 어떤 이진수 배열로 되어 있는지 알아낼 수 있다.
 * toBits, toRawBits는 다음과 같이 선언되어 있다.
 *
 * fun Double.toBits(): Long
 * fun Float.toBits(): Int
 * fun Double.toRawBits: Long
 * fun Float.toRawBits(): Int
 */
fun main(args: Array<String>) {

    //순서대로 일반 실수, 무한, NaN으로 실수 값
    val normal = 10.0
    val infinite = 10.0 / 0
    val nan = 0.0 / 0

    //정수 타입의 toString에 Int 값을 인수로 넘기면 해당 숫자의 진법대로 문자열을 생성한다.
    println(normal.toBits().toString(2))
    println(infinite.toBits().toString(2))
    println(nan.toBits().toString(2))

    println(normal.toRawBits().toString(2))
    println(infinite.toRawBits().toString(2))
    println(nan.toRawBits().toString(2))

    /**
    100000000100100000000000000000000000000000000000000000000000000
    111111111110000000000000000000000000000000000000000000000000000
    111111111111000000000000000000000000000000000000000000000000000
    100000000100100000000000000000000000000000000000000000000000000
    111111111110000000000000000000000000000000000000000000000000000
    -1000000000000000000000000000000000000000000000000000
     */
}
