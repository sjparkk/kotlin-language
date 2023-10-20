package com.example.kotlinlanguage.part4_2

/**
 * BigDecimal 클래스 : 매우 작은 실수 보관하기
 *
 * Double의 표현 범위를 뛰어 넘는 매우 작은 실수를 다루는 법을 알아본다.
 * BigInteger와 마찬가지로 자바 표준 라이브러리에 선언되어 있는 클래스이기 때문에 JVM 의존성을 가진다.
 */
fun main(args: Array<String>) {

    //BigDecimal도 코틀린 표준 라이브러리에서 연산자 확장 함수들을 제공하기 때문에 Double 타입을 다루듯이 쓸수 있다.
    val a = 3.000000000000003.toBigDecimal()
    val b = 4.000000000000004.toBigDecimal()

    //오차 없이 출력되며 BigDecimal 클래스를 이용하면 소수점 자리가 아무리 길어도 실수값을 정확하게 표현할 수 있어 실수 타입의 고질적인 문제를 해결할 수 있다.
    println(a * b)//12.000000000000024000000000000012


}
