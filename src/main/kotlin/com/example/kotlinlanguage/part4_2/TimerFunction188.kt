package com.example.kotlinlanguage.part4_2

import java.util.*
import kotlin.concurrent.timer

/**
 * Timer 함수 : 타이머 생성하기
 *
 * 일정한 주기마다 특정 함수를 호출하는 방법을 알아본다.
 * timer 함수를 이용하면 미리 설정해 놓은 주기마다 지정한 함수를 실행하게 할 수 있다.
 * timer 함수는 다음과 같이 선언되어 있다.
 *
 * fun timer(
 *   name: String? = null, // 타이머의 이름을 지정한다.
 *   daemon: Boolean = false, // 데몬 스레드로 만들 것인지 여부를 정한다.
 *   initialDelay: Long = 0.toLong(), // 초기 지연 시간을 밀리초 단위로 설정한다.
 *   period: Long, // 주기를 밀리 초 단위로 설정한다.
 *   action: TimerTask.() -> Unit // 매 주기 마다 실행할 함수를 지정한다. 리시버 타입의 TimerTask는 자바의 TimeTask이며, 타이머의 정보를 가져오거나 타이머를 중지하는데 사용
 * ): Timer
 */
fun main(args: Array<String>) {

    var i = 1
    val t: Timer = kotlin.concurrent.timer(initialDelay = 1500, period = 250) { // 1.5초 대기 뒤 0.25 초 마다 정수의 값 증가시키며 출력하는 타이머 생성 후 실행
        println(i)
        i += 1
    }

    Thread.sleep(2400)
    t.cancel() // 2.4초 대기 뒤 취소
}