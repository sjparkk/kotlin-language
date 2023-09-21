package com.example.kotlinlanguage.part4_1

/**
 * MutableListIterator 인터페이스 살펴보기
 *
 * List에 특화된 MutableIterator인 MutableListIterator 인터페이스의 멤버를 살펴본다.
 *
 * MutableListIterator<T> 인터페이스는 ListIterator<T>와 MutableIterator<T> 인터페이스를 구현한다.
 * MutableListIterator<T>에서 추가된 멤버는 다음과 같다.
 *
 * set은 커서가 가리키는 위치의 원소를 element로 교체한다.
 * abstract fun set(element: T): Unit
 *
 * add는 커서가 가리키는 위치에 element를 추가한다.
 * abstract fun add(element: T): Unit
 */

fun main(args: Array<String>) {

    val list = mutableListOf(1, 2, 3)

    //MutableList의 listIterator 멤버 함수는 ListIterator가 아닌 MutableListIterator를 반환한다.
    val iter: MutableListIterator<Int> = list.listIterator()

    //[1, 2, 3]
    println(list)

    // 1번째를 가리킴
    iter.next(); iter.next()

    iter.add(7)
    //[1, 2, 7, 3]
    println(list)

    // 커서를 다음 원소로 옮긴 뒤 값을 10으로 수정
    iter.next(); iter.set(10)
    //[1, 2, 7, 10]
    println(list)
}
