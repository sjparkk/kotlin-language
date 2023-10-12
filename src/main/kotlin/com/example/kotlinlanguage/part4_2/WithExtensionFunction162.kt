package com.example.kotlinlanguage.part4_2

/**
 * with 함수: 코드 중복 줄이기
 *
 * with 함수를 통해 중복되는 표현식을 하나로 묶는 방법을 알아본다.
 * with는 run과 let에 비해 이해하기 쉽고 사용법도 직관적이다.
 *
 * T 타입의 인수를 receiver 매개변수로 받고, 이를 block 매개변수가 가리키는 함수에 바로 넣어 호출
 * inline fun <T, R> with(receiver: T, block: T.() -> R): R {
 *   return receiver.block()
 * }
 */
fun main(args: Array<String>) {

    val a = 3; val b = 7

    //with 함수의 인수 a * b - b * b는 함수 리터럴의 this로 전달된다.
    with(a * b - b * b) {
        println(this)
        println(-this)
    }

    //run, let, with는 표기법만 다르지 사실 완전히 똑같은 역할을 한다.
}