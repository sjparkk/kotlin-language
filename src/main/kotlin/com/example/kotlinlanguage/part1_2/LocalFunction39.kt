package com.example.kotlinlanguage.part1_2

/**
 * 함수 속에 함수를 선언하는 방법을 배운다.
 *
 * 만약, 어떤 함수가 특정 함수 안에서만 사용된다면, 지역 함수라는 것을 사용해 볼 수 있다.
 * '지역 함수'란, 블록 안에 선언된 함수를 뜻한다.
 */
fun main(args: Array<String>) {

    //main 안에서만 쓰이는 함수 선언
    fun printFomular(a: Int, b: Int) {
        println(a * b + a - b)
    }

    printFomular(73, 1)
    printFomular(4, 6)

}
