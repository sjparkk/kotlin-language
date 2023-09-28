package com.example.kotlinlanguage.part4_1

/**
 * 컬렉션 중 원하는 원소 걸러내기
 *
 * 코틀린에 내장된 확장 함수를 이용하여 원하는 원소만 걸러내는 방법을 알아본다.
 * filter 계열의 확장함수를 이용하면 컬렉션 중 원하는 원소만 걸러낼 수 있다.
 */

fun main(args: Array<String>) {

    /**
     * filter 확장 함수는 다음과 같이 선언되어 있다.
     * inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T>
     * inline fun <T> Array<out T>.filter(predicate: (T) -> Boolean): List<T>
     * fun <T> Sequence<T>.filter(predicate: (T) -> Boolean): Sequence<T>
     */

    val to50 = 1..50

    //4의 배수만 출력
    println(to50.filter { it % 4 == 0 })

    //4의 배수가 아닌 것만 출력
    println(to50.filterNot { it % 4 == 0 })

    //null이 아닌 원소만 걸러내는 확장 함수
    println(to50.filterNotNull())

    //index 매개변수를 추가한 버전
    println(to50.filterIndexed { index, element -> element > 20 })

    //지정한 타입에 맞는 원소만 걸러내는 확장 함수이며, to50은 다 Int 형 이므로 Long타입이 없어 [] 출력
    println(to50.filterIsInstance<Long>())
}