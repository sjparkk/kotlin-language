package com.example.kotlinlanguage.part4_1

/**
 * Closed range 인터페이스: 닫힌 구간을 표현하는 인터페이스
 *
 * 닫힌 구간을 표현하는 ClosedRange 인터페이스를 알아보고, 어떤 클래스가 ClosedRange 인터페이스를 구현하는지 알아본다.
 */

/**
 ClosedRange 인터페이스는 다음과 같이 선언되어 있다.

 ClosedRange는 타입 매개변수로 Comparable<T>를 구현하는 타입만 받는다. 대소 비교가 가능해야 범위를 형성할 수 있기 때문
 interface ClosedRange<T: Comparable<T>> {
    val start: T //프로퍼티 구간의 최소값
    val endInclusive: T // 최대값
    operator fun contains(value: T): Boolean = value >= start && value <= endInclusive // contains는 in 연산자를 지원하는 역할
    fun isEmpty(): Boolean = start > endInclusive // 구간이 비어 있는지, 즉 구간에 포함되는 객체가 존재하지 않는지 여부를 반환
 }
 */


fun main(args: Array<String>) {

    val intRange: IntRange = 1..10
    val longRange: LongRange = 1L..100L
    val charRange: CharRange = 'A'..'Z'

    println(intRange.start) // 1
    println(longRange.endInclusive) // 100
    println('*' in charRange) // false
    println(charRange.isEmpty()) // 구간은 비어있지 않으므로 false

    //실수 타입에 대한 Range 클래스는 원래 존재하지 않았으나 코틀린 1.1버전부터 ClosedFloatRange, ClosedDoubleRange라는 클래스를 제공
    //단 이들은 IntRange .. 들과 다르게 for문의 in 연산자에 사용할 수 없는데 iterator 연산자 멤버 함수를 갖고 있지 않기 때문
}
