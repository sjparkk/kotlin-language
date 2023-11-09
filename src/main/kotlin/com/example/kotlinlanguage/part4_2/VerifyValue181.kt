package com.example.kotlinlanguage.part4_2

/**
 * 인수(Argument) 검증하기
 *
 * 매개변수로 전달된 값이 유효한지 검증하는 방법을 배운다.
 * check와 require 함수를 이용하면 값이 특정 조건을 만족하지 않을 때 예외를 던질 수 있다.
 * 보통 매개변수에 들어온 값이 유효한지 검사할 때 사용한다.
 */
fun func(num: Int?) {
    //checkNotNull은 인수로 전달한 값이 null이면 IllegalStateException 예외를 던지고, null이 아니면 Non-null 타입으로 캐스팅하여 그대로 반환한다.
    checkNotNull(num)
    //그렇기 때문에 num에 !! 표시는 필요가 없으며, check의 경우 인수의 값이 false이면 IllegalStateException 예외를 던진다.
    check(num!! >= 0)
}

fun func2(num: Double?) {
    //requireNotNull의 경우 인수로 전달한 값이 null이면 IllegalArgumentException 예외를 던지고, 인수로 전달한 값이 null이 아니면 Non-null 타입으로 캐스팅하여 그대로 반환
    requireNotNull(num)
    //require은 인수로 전달한 값이 false이면 IllegalArgumentException 예외를 던진다.
    require(num!!.isNaN())
}

fun main(args: Array<String>) {
    func(10)
    func2(0.0 / 0.0)
}