package com.example.kotlinlanguage.part2_1

/**
 * in 연산자
 *
 * in 연산자의 기능과 in 연산자를 오버로딩하는 방법에 대해 배운다.
 */
class InOperator62 {

    fun main(args: Array<String>) {

        //컴파일 시 "Kotlin".contains('o') 로 번역
        // 'o' 문자가 포함되어 있으므로 true 출력
        println('o' in "Kotlin")

        //컴파일 시 !"Kotlin".contains("in") 으로 번역
        //문자열 "in"은 포함되어 있으므로 false 출력
        println("in" !in "Kotlin")

        //in 연산자는 operator fun contains(매개변수: 타입): Boolean 멤버 함수로 오버로딩 할 수 있음
        //매개 변수의 타입은 자유롭게 지정 가능하며 when문에서도 사용 가능하다.
    }
}