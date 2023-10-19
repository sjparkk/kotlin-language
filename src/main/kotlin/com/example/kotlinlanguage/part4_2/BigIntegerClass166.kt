package com.example.kotlinlanguage.part4_2

import java.math.BigInteger

/**
 * BigInteger 클래스 : 매우 큰 정수 보관하기
 *
 * Long의 표현 범위를 뛰어 넘는 매우 큰 정수를 다루는 법을 배운다.
 * BigInteger는 코틀린이 아닌 자바 표준 라이브러리에 속해있다.
 */

fun main(args: Array<String>) {

    //BigInteger는 자바 클래스이기 때문에 그 자체로는 연산자 오버로딩을 지원하지 않지만 코틀린 표준 라이브러리에서 BigInteger에 대한 연산자 확장 함수들을 제공하기 때문에 Int 타입 다룰수있다.
    val a: BigInteger = 78423343545.toBigInteger()
    val b = 25372465331.toBigInteger()

    //Long의 표현 범위를 넘는 값이 출력되는 것을 확인 할 수 있다.
    println(a * b) //1989793565236615138395
    println(a + b * 936273.toBigInteger())

    //BigInteger 클래스는 toString도 오버라이딩 하고 있어 println의 인수로 넘겨도 값이 제대로 출력된다.
}