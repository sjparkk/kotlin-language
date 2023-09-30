package com.example.kotlinlanguage.part4_1

/**
 * Char sequence 인터페이스: 문자열과 관련된 클래스가 구현하는 뼈대 인터페이스
 *
 * 문자열이 갖추고 있어야 할 기본적인 뼈대를 정의하는 CharSequence 인터페이스에 대해 알아본다.
 * CharSequence는 String, String Builder 등 문자열과 관련된 클래스들이 구현하는 기본적인 뼈대 인터페이스이다.
 * (CharSequence이 Sequence 인터페이스를 상속할 것 같지만 어떠한 인터페이스도 상속하고 있지 않으니 주의)
 *
 * CharSequence는 하나의 프로퍼티와 두 개의 멤버 함수를 갖고 있다.
 * abstract val length: Int // 문자열의 길이
 * abstract operator fun get(index: Int): Char //문자열의 문자 하나를 [] 연산자로 접근 가능하도록 해주는 연산자 멤버 함수
 * abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence //설정 구간의 문자열을 뽑아 새 CharSequence로 변환하는 멤버함수
 */

fun main(args: Array<String>) {

    val seq: CharSequence = "Hello"
    println(seq.length) // 길이 5
    println(seq[2]) // 2번째 인덱스 문자 출력 l
    println(seq.subSequence(1,4)) // [1,4)구간 -> ell
}