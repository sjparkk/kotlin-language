package com.example.kotlinlanguage.part4_1

/**
 * Collection 인터페이스 살펴보기
 *
 * Collection 인터페이스의 멤버를 살표본다.
 */

/**
Collection 인터페이스는 다음과 같이 선언되어 있다.
interface Collection<out E>: Iterable<E> // Iterable<E>는, fun iterator(): Iterator<E> 멤버 함수를 컬렉션에 주입하기 위한 인터페이스 이다.

Collection 인터페이스는 한 개의 추상 프로퍼티와, 네개의 추상 멤버 함수를 갖고 있다.

컬렉션에 포함된 원소의 개수를 갖는 프로퍼티
abstract val size: Int

//비어 있는지 여부
abstract fun isEmpty(): Boolean

element가 컬렉션에 포함되어 있는지 여부
abstract operator fun contains(element: E): Boolean

elements의 원소들이 컬렉션에 모두 포함되어 있는지 여부
abstract fun containsAll(elements: Collection<E>): Boolean

컬렉션의 각 원소를 순회하는 Iterator<E> 타입의 객체를 반환하는 연산자 멤버함수 -> 컬렉션을 for문의 in 연산자에 사용할 수 있도록 해줌
abstract fun iterator(): Iterator<E>
 */

fun main(args: Array<String>) {

    val list: Collection<Int> = listOf(18, 1, 1, 4)

    println(list.size) //4
    println(list.isEmpty()) //false
    println(18 in list) // false

    for(i: Int in list) // 18 1 1 4
        println("$i ")
}

