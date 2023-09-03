package com.example.kotlinlanguage.part4_1

import java.io.Serializable

/**
 * Pair 클래스 : 두 변수를 하나로 묶기
 *
 * 두 개의 변수를 하나로 묶어주는 Pair 클래스를 알아본다. 또, 이를 응용하여 함수가 두 개의 값을 반환하도록 해본다.
 */

//Pair 클래스를 이용하면 두 변수를 하나로 묶을 수 있다.
data class Pair<out A, out B>(
    val first: A,
    val second: B
): Serializable

//Pair 클래스는 제네릭을 이용하여 두 가지 타입의 값을 보관한다.
fun divide(a: Int, b: Int): Pair<Int, Int> = Pair(a / b, a % b)

fun main(args: Array<String>) {
    //Pair 클래스는 데이터 클래스이므로 이렇게 여러 변수로 분해할 수 있다.
    val (q, r) = divide(10, 3)
    println("몫: $q")
    println("나머지: $r")
}