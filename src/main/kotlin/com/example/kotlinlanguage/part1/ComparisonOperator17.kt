package com.example.kotlinlanguage.part1

/**
 * 참과 거짓을 표현하는 Boolean 타입과 두 표현식의 값을 비교하는 연산자에 대해 배운다.
 *
 * 비교 연산자는 말 그대로 두 피연산자를 비교하는 연산자이다.
 * 비교 연산자의 결과 타입은 Boolean이며, Boolean 타입에는 true , false 라는 특수값만 저장할 수 있다.
 */
fun main(args: Array<String>) {

    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight) // true

    isRight = false
    println(isRight) // false

    //코틀린에서 ==, != 연산자는 자바의 equals 메서드를 호출한 것과 같음, 자바처럼 객체의 참조 값끼리 비교하려면 ===, !== 연산자 사용
    isRight = 30 == (10 + 20)
    println(isRight) // true

    //같은지 비교
    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight) // false

    //작거나 같은지 비교, >= 크거나 같은지 비교
    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight)


}