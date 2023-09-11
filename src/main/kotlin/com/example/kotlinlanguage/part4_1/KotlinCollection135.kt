package com.example.kotlinlanguage.part4_1

/**
 * 코틀린의 컬렉션
 *
 * 컬렉션의 개념에 대해 알아본다.
 *
 * 컬렉션이란, 프로그램을 개발하는데 필요한 기본적인 자료구조들을 통칭하는 말이며 코틀린에는 크게 3가지 컬렉션 존재
 *
 * List : 순서가 있는 목록을 표현하는 자료구조, 동적 배열이나 연결 리스트가 여기에 포함
 * Set : 집합을 표현하는 자료구조, 원소의 중복을 허용하지 않으며, 각 원소는 순서를 갖지 않음
 * Map : 연관 배열을 표현하는 자료구조, 키와 값을 1:1로 대응시켜 저장, 키는 중복될 수 없다.
 *
 * 코틀린에는 컬렉션의 뼈대가 되는 Collection<E> 인터페이스와, List<E>, Set<E>, Map<K,V> 인터페이스가 있다. -> 타입 매개변수의 이름 E는 Element(요소)의 앞 글자를 따옴, Key, Value
 * List와 Set은 Collection 인터페이스를 상속하고 Map은 상속하지 않는다.
 */

fun main(args: Array<String>) {

    //listOf는 주어진 인수로 List<T> 타입의 객체를 생성하는 함수 -> fun <T> listOf(vararg elements: T): List<T> 제네릭이 적용되어 있어 임의 타입의 List<T> 객체를 생성 가능
    val list: Collection<Int> = listOf(10, 20, 10)

    //setOf는 fun <T> setOf(vararg elements: T): Set<T> -> set은 중복 허용하지 않기 때문에 1, 2, 3 만 저장됨
    val set: Collection<Int> = setOf(1, 2, 3, 2, 3)

    //mapOf는 fun <K, V> mapOf(vararg paris: Pair<K,V>): Map<K, V>
    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

}