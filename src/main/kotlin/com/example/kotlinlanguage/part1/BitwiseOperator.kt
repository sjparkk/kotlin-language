package com.example.kotlinlanguage.part1

/**
 * 코틀린 비트 연산자에 대해 배운다.
 *
 * 코틀린의 비트 연산자는 기호가 아닌 문자로 되어 있음.
 */
fun main(args: Array<String>) {

    //15와 7을 비트 단위로 and 연산 -> 자바 &
    // 15를 비트 2진수로 나타내게 되면 1111, 7은 0111 이므로 and 연산 시 0111이 되어 7이 되는 것.
    println(15 and 7) // 7

    //5와 2를 비트 단위로 or 연산 -> 자바 5 | 2
    println(5 or 2) // 7

    //15와 5를 비트 단위로 xor 연산 -> 자바 15 ^ 5
    println(15 xor 5) // 10

    //32767을 비트 단위로 반전 -> 자바 ~32767
    println(32767.inv())

    //1을 왼쪽으로 3칸 시프트 -> 자바 1 << 3
    println(1 shl 3)

    //8을 오른쪽으로 1칸 시프트 -> 자바 8 >> 1
    println(8 shr 1)

    //부호를 유지한 채 -17을 오른쪽으로 2칸 시프트 -> 자바 -17 >>> 2
    println(-17 ushr 2)
}