package com.example.kotlinlanguage.part4_2

/**
 * StringBuilder 클래스 : 문자열 덧붙이기
 *
 * StringBuilder 클래스를 이용하여 + 연산을 할 때마다 문자열이 새로 생성되는 문제를 해결하는 방법을 알아본다.
 *
 * 문자열간 + 연산시 주의점에서 String 타입끼리 + 연산을 하면 덧셈의 결과가 힙에 매번 새로 생성된다.
 * 그러나 StringBuilder 클래스는 문자열을 추가할 때 String 처럼 문자열을 매번 생성하지 않고 기존의 문자열에 덧붙이는 동작을 한다.
 *
 * class StringBuilder: CharSequence, Appendable
 *
 * append라는 이름으로 3개의 멤버 함수가 오버로딩 되어 있으며, 원래 갖고 있던 문자열에 새 문자열을 덧붙이는 기능을 한다.
 * interface Appendable {
 *  fun append(csq: CharSequence): Appendable
 *  fun append(csq: CharSequence, start: Int, end: Int): Appendable
 *  fun append(c: Char): Appendable
 * }
 */
fun main(args: Array<String>) {

    //append 멤버 함수는 StringBuilder 자기 자신을 반환하기 때문에 이렇게 연쇄적으로 호출이 가능하다.
    val builder = StringBuilder()
        .append("2018 ")
        .append("Pyeongchang ")
        .append("Olympic")

    val result = builder.toString()
    println(result) // 2018 Pyeongchang Olympic
}