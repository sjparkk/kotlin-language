package com.example.kotlinlanguage.part4_2

/**
 * toList 확장 함수: List 타입으로 변환하기
 *
 * 여러 가지 타입을 List 타입으로 변환하는 toList 확장 함수를 알아본다.
 * toList는 어떤 타입을 List 타입으로 전환하는 확장 함수이다.
 * fun <T> 수많은 타입.toList(): List<T>
 */
fun main(args: Array<String>) {

    //NOTE: Pair의 타입 인수가 모두 같아야 한다.
    val list: List<Int> = Pair(10, 20).toList()

    //NOTE: Triple의 타입 인수가 모두 같아야 한다.
    val list2: List<Double> = Triple(3.1, 6.25, 8.15).toList()

    /**
     * toList는 Pair, Triple, Iterable, 그 외 수많은 타입을 리시버로 하고 있다.
     */
}