package com.example.kotlinlanguage.part4_1

/**
 * 컬렉션 정렬하기
 *
 * 코틀린에 내장된 확장 함수를 이용하여 컬렉션을 정렬하는 방법을 알아본다.
 *
 * sorted 함수는 다음과 같이 선언되어 있으며, 각 원소는 반드시 Comparable<T>를 구현하고 있어야 정렬이 가능하다. 비교가 가능해야 하기 때문
 * fun <T: Comparable<T>> Iterable<T>.sorted(): List<T>
 * fun <T: Comparable<T>> Array<out T>.sorted(): List<T>
 */

fun main(args: Array<String>) {

    val list = listOf(43, 76, 28, 19, 22, 68)

    //오름차순
    println(list.sorted()) // [19, 22, 28, 43, 68, 76]

    //내림차순
    println(list.sortedDescending()) // [76, 68, 43, 28, 22, 19]
}