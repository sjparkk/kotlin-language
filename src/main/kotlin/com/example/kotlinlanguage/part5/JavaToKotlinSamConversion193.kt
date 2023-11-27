package com.example.kotlinlanguage.part5

/**
 * 코틀린에서 자바 코드 접근하기: SAM 변환
 *
 * SAM의 뜻과 코틀린에서 SAM 변환을 하는 방법을 알아본다.
 * SAM이란, 단일 추상 메서드(Single Abstract Method)의 줄임말로, 메서드를 한 개만 갖고 있는 인터페이스를 뜻한다.
 * 대표적인 예로 Runnable, Comparable 등이 있다.
 * SAM변환이란, 함수 리터럴을 특정 인터페이스로 변환하는 것을 뜻한다.
 */
fun main(args: Array<String>) {

    //Runnable 인터페이스는 매개변수와 반환 타입이 없는 추상 메서드를 갖는다.
    //따라서 () -> Unit 형태의 함수로 Runnable 타입을 대신 표현해도 무방하다.
    //함수 리터럴 앞에 단일 추상 메서드를 갖는 인터페이스 이름을 적으면, 그 인터페이스 타입으로 표현식이 변한다.
    //즉 { println("SAM") } 까지는 () -> Unit 타입의 표현식이지만, Runnable { println("SAM") } 까지 적으면 Runnable 타입의 표현식이 된다.
    val runnable: Runnable = Runnable { println("SAM") }
    runnable.run()
}