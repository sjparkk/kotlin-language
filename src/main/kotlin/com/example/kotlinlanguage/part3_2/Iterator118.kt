package com.example.kotlinlanguage.part3_2

/**
 * 반복자 Iterator
 *
 * 반복자의 개념과 역할에 대해 알아본다.
 */

//반복자란, 특정 구간 속에 있는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스를 뜻한다.
//코틀린에는 Iterator라는 인터페이스가 기본적으로 선언되어 있다.
/**
 interface Iterator<out T> {
    operator fun next(): T //operator 키워드가 붙어있기는 하지만, 실제로 어떤 연산자를 오버로딩하는 것은 아니다.
    operator fun hasNext(): Boolean
 }
 */

fun main(args: Array<String>) {

    //IntRange 클래스에는 operator fun iterator(): IntIterator 연산자 멤버 함수가 선언되어 있다. -> IntIterator는 Iterator<Int>를 구현하는 클래스이기 때문에 Iterator<Int> 타입으로 받을 수 있다.
    val range: IntRange = 1..3
    val iter: Iterator<Int> = range.iterator()


    println(iter.hasNext()) // true
    println(iter.next()) // 1

    println(iter.hasNext()) // true
    println(iter.next()) // 2

    println(iter.hasNext()) // true
    println(iter.next()) // 3

    println(iter.hasNext()) // false
}