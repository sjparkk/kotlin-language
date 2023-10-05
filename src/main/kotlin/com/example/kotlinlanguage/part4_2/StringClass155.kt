package com.example.kotlinlanguage.part4_2

/**
 * String 클래스 살펴보기
 *
 * String 클래스에 대해 자세히 알아본다.
 *
 * 먼저, String 클래스는 다음과 같이 선언되어 있다.
 * class String: Comparable<String>, CharSequence
 *
 * Comparable, CharSequence 인터페이스를 구현한다. 그리고 다음 멤버를 추가적으로 갖는다
 * operator fun plus(other: Any?): String // plus는 String 타입끼리 + 연산을 할 수 있도록 해주는 연산자 멤버 함수
 *
 * 이외의 멤버는 모두 Comparable과 CharSequence 인터페이스에서 왔다. 즉, String은 + 연산이 가능하다는 점 빼고 CharSequence와 거의 기능이 동일하다.
 */
fun main(args: Array<String>) {

    val one = "Hello"
    val two = "Kotlin"
    val three = "JavaFx"

    println(one + two) // HelloKotlin

    //Comparable 인터페이스를 구현하고 있어 비교 연산자를 사용할 수 있다.
    //문자열의 길이가 긴쪽이 항상 크고, 문자열의 길이가 같으면 첫 글자부터 유니코드 순서 기준으로 비교한다.
    println(one > two) // false
    println(two > three) //true
}