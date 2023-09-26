package com.example.kotlinlanguage.part4_1

/**
 * 컬렉션 원소 타입 변환하기
 *
 * 코틀린에 내장된 확장 함수를 이용하여 컬렉션의 원소 타입을 변환하는 방법을 알아본다.
 *
 * map 계열의 확장 함수를 이용하면 Collection<T> 타입을 Collection<R> 타입으로 변환할 수 있다.
 */
fun main(args: Array<String>) {

    /**
     * map 확장함수는 다음과 같이 선언되어 있다.
     * 기본적인 기능은 T타입의 원소를 R타입의 원소로 변환하는 것, map 함수는 transform함수를 적용하여 변환
     * inline fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R>
     * inline fun <T, R> Array<out T>.map(transform: (T) -> R): List<R>
     * fun <T, R> Sequence<T>.map(transform: (T)-> R): Sequence<R>
     */


    val origin = listOf(65, 66, 67, 68, 69)
    println(origin.map { it.toChar() })

    //mapIndexed는 변환 함수에 index 매개변수를 추가한 버전
    println(origin.mapIndexed { index, element ->
        println("[$index]:$element")
        element.toChar()
    })

    //IntRange타입의 변수를 선언과 동시에 1..100로 초기화
    val to100 = 1..100

    //mapNotNull은 변환 함수가 null을 반환하면 결과에서 제외
    println(to100.mapNotNull {
        if(it % 3 == 0) it
        else null
    })
}