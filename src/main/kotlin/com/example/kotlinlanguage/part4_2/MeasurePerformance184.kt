package com.example.kotlinlanguage.part4_2

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/**
 * 코드 성능 측정하기
 *
 * 코드의 성능을 측정하는 방법을 배운다.
 */
fun main(args: Array<String>) {

    /**
    import kotlin.system.measureNanoTime
    import kotlin.system.measureTimeMillis
    와 같이 kotlin.system 에 선언된 함수는 다른 코틀린 내장 함수와 다르게 반드시 import 해줘야 한다.
     */

    //fun measureNanoTime(block: () -> Unit): Long -> 매개변수가 없고 반환 타입이 Unit인 함수를 block 매개변수로 받으며, block에 전달한 함수를 호출하고, 함수가 끝나기까지 경과한 시간을 밀리 초 단위로 반환한다.
    println(measureTimeMillis {
        var sum = 0L
        for (i in 1..10000000) {
            sum += i
        }
    })

    println(measureNanoTime {
        var sum = 0L
        for (i in 1..10000000) {
            sum += i
        }
    })
}
