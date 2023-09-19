package com.example.kotlinlanguage.part4_1

/**
 * Mutable iterator 인터페이스 살펴보기
 *
 * 커서가 가리키고 있는 원소를 삭제할 수 있는 MutableIterator 인터페이스에 대해 알아본다.
 *
 * MutableIterator 인터페이스는 다음과 같이 선언되어 있다.
 * 커서가 가리키고 있는 원소를 삭제할 수 있는 멤버 함수 remove가 추가되어 있다.
 * public interface MutableIterator<out T>: Iterator<T> {
 *  public fun remove(): Unit
 * }
 */
fun main(args: Array<String>) {

    val list = mutableListOf(1, 2, 3)

    //MutableList<Int> 타입의 list 변수로부터 MutableIterator<Int>를 얻어내고 있다.
    val iter: MutableIterator<Int> = list.iterator()

    println(list) // [1, 2, 3]

    //반복자의 커서를 첫번째 원소로 옮기기 위해 Next를 호출한 뒤 remove를 호출하여 첫 원소를 삭제
    iter.next(); iter.remove()
    println(list) // [2, 3]

    iter.next(); iter.remove()
    println(list) // [3]
}