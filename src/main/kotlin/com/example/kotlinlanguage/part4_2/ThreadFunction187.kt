package com.example.kotlinlanguage.part4_2

import kotlin.concurrent.thread

/**
 * Thread 함수 : 스레드 생성하기
 *
 * 코틀린에서 스레드를 생성하는 방법을 배운다.
 * 스레드 함수는 JVM의 스레드를 생성하기 때문에 이 함수를 사용하면 JVM에 의존성이 생긴다.
 *
 * 스레드 함수는 다음과 같이 선언되어 있다.
 *
 * public fun thread(
 *    start: Boolean = true,  //true를 넘기면 스레드를 생성과 동시에 바로 실행한다.
 *    isDaemon: Boolean = false, //데몬 스레드로 만들 것인지 여부를 지정한다.
 *    contextClassLoader: ClassLoader? = null, // 스레드에서 사용할 클래스 로더를 지정한다.
 *    name: String? = null, // 스레드의 이름을 지정한다.
 *    priority: Int = -1,  // 스레드의 우선순위를 지정한다. 1~10 사이의 정수를 지정하면 된다. 높은 숫자가 더 높은 우선순위를 갖는다.
 *    block: () -> Unit // 스레드에서 실행할 함수를 지정한다.
 * ): Thread
 *
 * 대부분의 매개변수에 디폴드 인수가 지정되어 있기 때문에 원하는 매개변수에만 이름을 명시한 인수를 넘겨주면 된다.
 */
fun main(args: Array<String>) {

    thread(start = true) {
        println("Hello, ")
        Thread.sleep(1000)
        println("World!")
    }

    Thread.sleep(500)
    println("Kotlin")
}