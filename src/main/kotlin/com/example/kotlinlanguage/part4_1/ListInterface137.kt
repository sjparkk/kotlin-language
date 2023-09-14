package com.example.kotlinlanguage.part4_1

/**
 * List 인터페이스 살펴보기
 *
 * List 인터페이스는 다음과 같이 선언되어 있다.
 * interface List<out E>: Collection<E>
 *
 * List 인터페이스는 다음과 같은 추상 멤버 함수를 갖고 있다.
 * abstract operator fun get(index: Int): E
 * get은 List의 index 번째 원소를 반환하는 멤버 함수이다. List에 []연산자를 쓸 수 있도록 하는 역할도 한다.
 *
 * abstract fun indexOf(element: E): Int
 * indexOf은 element 원소가 List의 몇 번째 인덱스에 위치해 있는지를 반환하는 멤버 함수 -> 만약 해당 원소가 없다면 -1 반환 -> 여러개 있다면 첫번째로 일치하는 원소의 인덱스 반환
 *
 * abstract fun lastIndexOf(element: E): Int
 * lastIndexOf 멤버 함수는 마지막으로 일치하는 원소의 인덱스를 반환한다는 점만 빼면 indexOf와 같다.
 *
 * abstract fun listIterator(): ListIterator<E>
 * abstract fun listIterator(index: Int): ListIterator<E>
 * listIterator는 List에 특화된 Iterator를 반환하는 멤버 함수이며 index 매개변수에 값을 지정하면 그 인덱스부터 시작하는 ListIterator를 반환
 *
 * abstract fun subList(fromIndex: Int, toIndex: Int): List<E>
 * subList는 설정 구간의 원소를 뽑아 새로운 List를 만들어 반환하는 멤버 함수이다.
 */

fun main(args: Array<String>) {

    val list: List<Double> = listOf(20.18, 1.14, 9.15, 1.14)

    println(list[0]) //첫번째 원소 20.18
    println(list.indexOf(1.14)) // 첫번째 일치 원소 인덱스 1
    println(list.indexOf(9.31)) // 존재하지 않아 -1
    println(list.lastIndexOf(1.14)) // 마지막 일치 원소 인덱스 3
    println(list.subList(0, 3)) // 0~2번 인덱스에 해당하는 원소를 뽑아 새 List를 만든 뒤 출력
}