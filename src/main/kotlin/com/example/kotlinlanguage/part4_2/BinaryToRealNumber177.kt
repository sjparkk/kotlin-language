package com.example.kotlinlanguage.part4_2

/**
 * fromBits 확장 함수 : 이진수 값으로부터 실수 값 만들기
 *
 * 이진수 값으로부터 실수 값을 만드는 방법을 배운다.
 *
 * fromBits 확장 함수는 toBits의 반대 역할을 한다.
 * fun Double.Companion.fromBits(bits: Long): Double
 * fun Float.Companion.fromBits(bits: Int): Float
 */
fun main(args: Array<String>) {
    val realNumber: Float = Float.fromBits(0b01000001_00100111_10101110_00010100)

    //0b01000001_00100111_10101110_00010100은 10.48에 대한 이진수 값이다.
    println(realNumber)
}
