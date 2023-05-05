package com.example.kotlinlanguage.part2_1

/**
 * 예외
 *
 * 예외가 무엇인지 알아본다.
 * 예외란, 프로그램 실행 중 예상치 못하게 발생한 상황을 뜻한다.
 * 예외가 발생하면 프로그램은 기본적으로 오류 메시지와 함계 강제 종료된다.
 */
class Exception71 {
}

fun main(args: Array<String>) {

    val str = "abcd"
    //str에 들어있는 문자열을 Int 타입으로 변환하려고 하고 있다.
    //str에는 숫자가 아닌 문자들이 저장되어 있으니 당연히 변환에 실패할 것이다. 이때 바로 예외가 발생한다.
    // Exception in thread "main"java.lang.NumberFormatException:For input string:"abcd"
    val num = str.toInt()
    // 예외가 발생하면 그 즉시 프로그램이 강제 종료되며, 그 아래에 있는 코드들은 실행되지 않는다. 따라서 println 함수는 실행되지 않는다.
    println(num)
}

