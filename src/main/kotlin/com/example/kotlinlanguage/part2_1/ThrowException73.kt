package com.example.kotlinlanguage.part2_1

/**
 * 예외 던지기
 *
 * 예외를 일으키는 방법에 대해 알아본다.
 *
 * 예외는 기본적으로 시스템에 의해 일어나지만, 고의로 예외를 발생시킬 수도 있다.
 * 이렇게 예외를 발생시키는 것을 '예외를 던진다'라고 표현
 */
fun main(args: Array<String>) {

    try {
        something()
    } catch (e: Exception) {
        println(e.message)
    }
}

fun something() {
    val num1 = 10
    val num2 = 0

    //예외가 던져지면 자신을 호출했던 함수로 예외 처리의 책임을 전가시킨다.
    //해당 함수에서도 예외를 처리하지 않으면, 다시 또 그 함수를 호출한 함수로 책임 전가가 되며, 그러다보면 언젠가는 main 함수까지 책임이 도달하게 된다.
    //main 함수는 예외 처리를 할 수 있는 최후의 보루이다.
    div(num1, num2)
}

fun div(a: Int, b: Int): Int {

    if(b == 0) {
        //예외는 던지는 코드 (throw Throwable 타입 표현식)
        //Exception은 Throwable 클래스를 상속하므로 문제 없음
        throw Exception("O으로 나눌 수 없습니다.")
    }
    return a/b
}

/**
 * 코틀린의 throws 키워드?
 *
 * 코틀린에는 throws 키워드가 없다. 코틀린 함수는 자바처럼 메서드 선언에 예외 정보를 포함하지 않는다.
 * 알다시피 자바에서는 throws가 있는 함수를 호출할 때마다 매번 함수 호출을 try-catch 블록으로 감싸야만 한다.
 * 하지만, 간결함을 중시하는 코틀린에서는 이런 지저분한 코드를 용납할 수 없어, 결곡 과감히 throws 키워드를 제거해 버렸다.
 * 코틀린에서의 예외 처리는 이제 필수가 아닌 옵션.
 */