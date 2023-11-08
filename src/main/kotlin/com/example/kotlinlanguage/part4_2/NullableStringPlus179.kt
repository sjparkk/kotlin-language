package com.example.kotlinlanguage.part4_2

/**
 * String?.plus 연산자 확장 함수
 *
 * 코틀린에 내장되어 있는 String?.plus 연산자 확장 함수 덕에 String? 타입에 연산자 +를 사용할 수 있음을 이해한다.
 *
 * operator fun String?.plus(other: Any?): String {
 *    return this.toString() + other.toString()
 * }
 */
fun main(args: Array<String>) {

    //nullStr에 null을 지정
    val nullStr: String? = null

    //nullStr은 String? 타입이므로 + 연산자를 사용하면 String 클래스의 plus 연산자 멤버 함수가 아닌 String?.plus 연산자 확장 함수가 호출된다.
    println(nullStr + "테스트")
}