package com.example.kotlinlanguage.part4_2

import kotlin.concurrent.thread

/**
 * Synchronized 함수: 스레드 동기화 하기
 *
 * 코틀린에서는 동기화를 위한 키워드를 따로 제공하지 않는다.
 * 그렇기에 synchronized 함수를 이용한다.
 */

private var obj: Int = 0

private fun objPlus() {

    //전역 변수 obj의 값을 1000번 증가
    for (i in 1..1000)
        //public inline fun <R> synchronized(lock: kotlin.Any, block: () -> R)
        //여기서 lock은 동시 수정으로 부터 보호할 객체이며, block은 lock 객체를 점유하고 있는 동안 실행 할 함수이다.
        synchronized(obj) {
            obj++
        }
}

fun main(args: Array<String>) {

    //두개의 스레드에서 obj의 값을 동시에 증가시키고 있다.
    thread { objPlus() }
    objPlus()

    //스레드가 종료될 때 까지 대기하는 코드
    Thread.sleep(100)
    println(obj)
}