package com.example.kotlinlanguage.part4_1

/**
 * Sequence 인터페이스 살펴보기
 *
 * 일련의 데이터를 표현하는 Sequence 인터페이스에 대해 알아본다.
 * Sequence도 List처럼 일련의 데이터를 표현하는 인터페이스아디.
 * 그러나 List와 달리 각 데이터를 lazily 하게 계산하기 때문에 잠재적으로 무한대의 데이터를 다룰수 있다.
 *
 * lazy의 의미
 * 프로그래밍에서 게으르게 계산 또는 로딩한다는 의미는 값을 미리 계산하고 가지고 있는 것이 아닌 필요한 순간에 계산을 시작하는 것을 뜻함
 * 동영샹을 예를 들때 미리 전체를 다운하지 않고 보려는 구간부터 영샹을 스트리밍하는 것이다.
 *
 * Sequence는 크기가 정해져 있지 않고 데이터가 레이지 계산되기 때문에 전체 크기를 한번에 파악할 수 없다.
 *
 * 따라서 size나 length같은 프로퍼티는 존재하지 않는다.
 *
 * Sequence 인터페이스는 iterator연산자 멤버함수만 있고, 사실상 Iterable인터페이스와 같ㄷ.
 * interface Sequence<out T> {
 *   operator fun iterator(): Iterator<T>
 * }
 */

fun main(args: Array<String>) {

    //fun <T> sequenceOf(vararg elements: T): Sequence<T>
    val seq: Sequence<Int> = sequenceOf(1,2,3)

    for (i in seq) {
        print("$i ")
    }
}
