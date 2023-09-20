package com.example.kotlinlanguage.part4_1

/**
 * MutableList interface 살펴보기
 *
 * 수정이 가능한 List인 MutableList에 대해 알아본다.
 *
 * mutableListOf 함수를 호출하면 MutableList<E> 타입의 객체가 반환된다.
 * MutableList<E> 인터페이스는 MutableCollection<E>를 상속한다. 다음은 MutableList<E>에서 추가된 멤버들이다.
 *
 * List는 각 원소에 순서가 있으므로, 이를 지원하는 멤버 함수가 추가되었다.
 *
 * add는 index 위치에 element를 추가하는 멤버 함수이다.
 * abstract fun add(index: Int, element: E): Unit
 *
 * addAll은 index 위치에 elements 컬렉션에 있는 모든 원소를 추가하는 멤버 함수이다. 변경이 일어났다면 true반환
 * abstract fun addAll(index: Int, element: Collection<E>): Boolean
 *
 * set은 []연산자를 오버로딩하는 멤버 함수이다. index번째 위치의 원소를 element로 교체
 * abstract operator fun set(index: Int, element: E): E
 *
 * index번째 원소를 삭제, 반환값은 삭제된 원소
 * abstract fun removeAt(index: Int): E
 *
 */
fun main(args: Array<String>) {

    val list: MutableList<Char> = mutableListOf('c', 'a', 'z')
    println(list) // [c, a, z]

    list.add(1, '%')
    println(list) // [c, %, a, z]

    list.addAll(0, listOf('L', 'P'))
    println(list) // [L, P, c, %, a, z]

    println(list.set(2, '/')) // 2번째 원소 교체 후 이전에 있던 값 c 출력
    println(list) // [L, P, /, %, a, z]

    println(list.removeAt(4)) // 삭제 된 a
    println(list) // [L, P, /, %, z]
}