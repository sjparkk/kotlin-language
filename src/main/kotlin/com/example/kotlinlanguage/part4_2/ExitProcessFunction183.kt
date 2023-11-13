package com.example.kotlinlanguage.part4_2

import kotlin.system.exitProcess

/**
 * exitProcess 함수: 어디서나 프로그램 종료하기
 *
 * 프로그램을 종료하려면 일반적으로 main 함수에서 return을 하거나, main 함수까지 예외를 던져야 한다.
 * 하지만 이렇게 코드를 작성하는 것은 쉽지 않다. 그래서 exitProcess함수를 이용하면 실행 흐름이 어디에 있든 바로 종료 시킬 수 있다.
 */
fun main(args: Array<String>) {

    something(-1)
    println("Hello") // 프로그램이 종료되어 해당 출력문은 실행 되지 않음
}

fun something(num: Int) {
    if(num < 0)
        exitProcess(0) //kotlin.system에 선언된 함수는 다른 코틀린 내장 함수와 다르게 반드시 import 해주어야 한다.

    /**
     inline fun exitProcess(status: Int): Nothing
     exitProcess함수가 호출되면 프로그램이 곧바로 종료되기 때문에 반환 타입은 Nothing이며,
     exitProcess 함수에 0을 전달하면 정상 종료, 0이 아닌 수를 전달하면 비정상 종료를 나타낸다.
     */
}