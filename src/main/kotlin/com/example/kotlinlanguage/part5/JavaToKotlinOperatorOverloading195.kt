package com.example.kotlinlanguage.part5

/**
 * 코틀린에서 자바 코드 접근하기: 연산자 오버로딩
 *
 * 일정 규칙을 만족하는 자바의 메서드를 코틀린에서 연산자 형태로 호출할 수 있음을 알아본다.
 */
fun main(args: Array<String>) {

    val java = JavaClass2()

    //JavaClass2의 contains 메서드가 호출된다.
    println(13 in java)

    //JavaClass2의 get 메서드가 호출된다.
    println(java[13])
    println(java[28])
    println(java[18])
}