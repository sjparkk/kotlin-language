package com.example.kotlinlanguage.part1_2


/**
 * if-else를 표현식으로 사용하는 법을 알아본다.
 *
 * if와 else가 모두 갖춰져 있으면 if-else 부분 전체가 표현식이 된다.
 */
fun main(args: Array<String>) {

    //if-else 가 있을 때 if 블록 또는 else 블록 안의 마지막 표현식이 값이 되어 value에 값이 된다.
    //또한 if 블록과 else 블록의 마지막 표현식의 타입은 일치해야 된다.
    val value: Int = if(10 > 5) {
        println("10은 5보다 크다")
        10
    } else {
        println("10은 5보다 크지 않다.")
        5
    }

    //추가적으로 다음과 같이 if-else 블록이 비어 있는 경우에는 Unit 타입이 되며 의미 없는 값이 저장이 된다.
//    val value = if(10 > 5) {
//
//    } else {
//
//    }

    //마지막으로 코틀린에서는 if-else 표현식을 삼항 연산자처럼 사용 가능하므로 자바처럼 삼항 연산자가 존재하지 않는다.

    println(value)
}