package com.example.kotlinlanguage.part1_1

/**
 * '=' 도 연산자임을 이해한다. 배정 연산자와 일반 연산자의 축약형도 알아본다.
 *
 * 배정 연산자는 변수에 값을 저장할 때 사용하는 연산자다.
 */
fun main(args: Array<String>) {

    val a: Int
    var b: Int

    // = 도 연산자이며 우선순위가 매우 낮기 떄문에 10 + 5 먼저 계산 됨
    a = 10 + 5
    // 참고로 연산자 우선순위는 * / %, +-, = 순으로 높음
    b = 10

    // b+=a 은 b= b+a 와 같음
    b += a // b에 a의 값을 누적
    println(b)

    b %= 3 // b를 3으로 나눈 나머지를 b에 저장
    println(b)

}