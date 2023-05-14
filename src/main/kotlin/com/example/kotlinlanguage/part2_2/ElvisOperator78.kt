package com.example.kotlinlanguage.part2_2

/**
 * 엘비스 연산자 ?:
 *
 * 특정 값이 Null일 때 다른 값으로 대체하는 연산자에 대해 알아본다.
 *
 * 엘리비 연산자는 왼쪽의 피연산자가 null이 아니면 그 값을 그대로 쓰고, null 이면 우측의 피연산자로 대체하는 매우 유용한 연산자이다.
 */
fun main(args: Array<String>) {

    val number: Int? = null
    //number에 null이 지정되어 있으므로 0이 출력된다.
    println(number?: 0)

    val number2: Int? = 15
    //number2에는 null이 지정되어 있지 않으므로 15가 출력된다.
    println(number2?: 0)


    /**
     * 자바에서 다음 코드를 코틀린에서는 return str?: "Hello"로 간단히 쓸 수 있다.
     */
//    String str;
//    ...
//    return (str != null) ? str : "Hello";

}
