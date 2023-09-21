package com.example.kotlinlanguage.part4_1

/**
 * MutableSet 인터페이스 살펴보기
 *
 * 수정이 가능한 Set인 MutableSet에 대해 알아본다.
 *
 * mutableSetOf 함수를 호출하면 MutableSet<E> 타입의 객체가 반환된다.
 * MutableSet<E> 인터페이스는 MutableCollection<E>를 상속한다. (MutableSet에서 따로 추가된 멤버는 없다)
 */
fun main(args: Array<String>) {

    val set: MutableSet<Int> = mutableSetOf(1, 5, 7)

    //초기 set - [1, 5, 7]
    println(set)

    //5는 존재하여 추가되지 않아 false 출력
    println(set.add(5))
    //[1, 5, 7]
    println(set)

    //7은 이미 있어 추가되지 않고 3은 없어 추가 됨, 하나라도 추가 되었으므로 true 반환
    println(set.addAll(listOf(3, 7)))
    //[1, 5, 7, 3], 추가적으로 set은 추가된 순서와는 무관하다
    println(set)
}