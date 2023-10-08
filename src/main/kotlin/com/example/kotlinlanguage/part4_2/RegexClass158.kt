package com.example.kotlinlanguage.part4_2

/**
 * Regex 클래스 : 정규식 다루기
 *
 * Regex 클래스를 이용하여 코틀린에서 정규식을 다루는 방법을 알아본다.
 * 코틀린은 정규식을 다룰 수 있는 Regex 클래스를 기본적으로 제공한다.
 *
 * 정규식 패턴이 담긴 문자열을 받는 생성자
 * constructor(pattern: String)
 *
 * input이 정규식에 매칭되는지 여부를 반환
 * infix fun matches(input: CharSequence): Boolean
 *
 * input 중 정규식에 매칭되는 부분을 replacement로 치환한다
 * fun replace(input: CharSequence, replacement: String): String
 */

fun main(args: Array<String>) {

    //숫자로 이루어져 있는지 검사하는 정규식 생성
    val regex = Regex("[0-9]+")

    val str = "4324235"
    val str2 = "324 6546 5432"

    //숫자로만 이루어져 있으므로 true
    println(regex matches str)

    //공백이 포함되어 있어 false
    println(regex matches str2)

    //숫자부분이 replcatement로 치환
    println(regex.replace(str2, "숫자"))
}