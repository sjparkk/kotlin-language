package com.example.kotlinlanguage.part2_1

/**
 * 예외 처리
 *
 * 예외를 다루는 방법을 배운다.
 *
 * 예외를 처리하지 않으면 프로그램은 무조건 강제 종료된다.
 * 코틀린에서는 예외가 발생했을 때 이를 처리할 수 있는 기회를 제공한다.
 */
class HandlingException72 {
}

fun main(args: Array<String>) {

    //예외가 발생할 가능성이 있는 부분을 try 블록으로 감싸고 있다.
    try {
        val str = "abcd"
        //str.toInt() 시 예외 발생하여 아래 코드는 실행되지 않고 catch 문 안으로 이동 됨
        val num = str.toInt()

        println(num)

    //예외가 발생했을 때 대신 실행할 코드를 catch 블록으로 지정한다.
    //catch 의 소괄호 안에는 어떤 예외가 발생했을 때 이 catch 블록을 실행할지를 지정한다.
    } catch (e: NumberFormatException) {
        //e는 예외 객체를 가리키는 참조 변수, NumberFormatException은 예외 타입 (잘못된 문자열을 숫자로 변환할 때 발생하는 예외)
        println("문자열을 숫자로 변경하지 못함")

        /**
         * 여러 종류의 예외를 처리하려면 catch 블록 여러개 두어 처리가 가능하다.
         */
    } finally {
        println("프로그램 종료")
    }
}