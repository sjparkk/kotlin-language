package com.example.kotlinlanguage.part4_2

/**
 * Double 값 검증하기
 *
 * 실수 타입의 변수에 NaN와 Infinite라는 특수 값이 저장될 수 있음을 이해하고 실수 타입의 변수에 올바른 값이 들어 있는지 검증하는 방법을 배운다.
 * Double 타입에는 NaN(Not a Number, 숫자가 아님) 또는 Infinite(무한) 이라는 툭수 값이 들어갈 수 있다.
 */
fun main(args: Array<String>) {

    val a: Double = 0.0 / 0.0
    val b: Double = 7 / 0.0
    val c: Double = 3.2

    //NaN
    print("$a ")
    //true
    println(a.isNaN()) // 리시버에 들어있는 값이 NaN이면 true

    //Infinity
    print("$b ")
    //true
    println(b.isInfinite())

    //3.2
    print("$c ")
    //true
    println(c.isFinite()) // 리시버에 들어있는 값이 정상적이면 true이다.

}