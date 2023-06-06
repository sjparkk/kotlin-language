package com.example.kotlinlanguage.part3_1

/**
 * 확장 함수의 리시버 타입이 상속 관계에 있을 때
 *
 * 확장 함수의 리시버 타입이 상속 관계에 있을 때, 실제로 어떤 타입의 확장 함수가 호출되는지 알아본다.
 */
//AAA와 BBB는 상속 관계이다.
open class AAA; class BBB: AAA()

//AAA클래스에 확장 함수 hello()를 주입하고 있다 (BBB도 마찬가지)
fun AAA.hello() = println("AAA")
fun BBB.hello() = println("BBB")

fun main(args: Array<String>) {

    //타입은 AAA이나 실제로는 BBB객체를 가리키는 test 참조변수를 선언하고 있다.
    val test: AAA = BBB()

    //여기서 AAA.hello()가 호출될까, BBB.hello()가 호출될까?
    test.hello()

    //정답은 AAA.hello()가 호출된다. -> 확장 함수는 멤버함수와는 다르게 참조변수가 실제로 가리키는 객체의 타입을 따르지 않는다.
    //참조변수의 타입을 그대로 따른다.

    //이렇듯 멤버함수와 확장 함수의 동작이 다르기 때문에 주의할 것!
}