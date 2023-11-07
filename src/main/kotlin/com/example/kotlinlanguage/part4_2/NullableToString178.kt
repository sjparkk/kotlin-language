package com.example.kotlinlanguage.part4_2

/**
 * Any?.toString 확장함수
 *
 * 코틀린에 내장되어 있는 Any?.toString 확장 함수 덕에 null 값에 toString을 호출해도 안전하다는 것을 이해한다.
 *
 * Any?.toString은 값이 null인 표현식에도 toString을 호출할 수 있게 해주는 유용한 확장 함수이다.
 * fun Any?.toString(): String = this?.toString() ?: "null"
 *
 * 만약 this가 null이라면 this?.toString() 표현식도 null이 될 것이다. 엘비스 연산자를 이용하면 null일 때 "null"을 대신 반환하고 있다.
 */
fun main(args: Array<String>) {

    //empty변수에는 null이 저장되어 있다.
    val empty: Int? = null
    //empty에 변수 타입이 Nullable이기 때문에 Int클래스의 멤버 함수 toString이 호출되는 것이 아닌 Any?.toString 확장 함수가 호출되어 str에는 "null"이 저장된다.
    val str: String = empty.toString()
    println(str)
}