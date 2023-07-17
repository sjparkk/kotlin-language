package com.example.kotlinlanguage.part3_1

/**
 * 함수 참조
 *
 * 이미 선언된 함수를 함수 타입의 표현식으로 만드는 법을 알아본다.
 */

//매개 변수 타입 (Int, Int), 반환 타입 Unit 타입인 함수 선언
fun plus(a: Int, b: Int) = println("plus 호출됨 ${a + b}")

object Object {
    fun minus(a: Int, b: Int) = println("Object의 minus 호출됨 ${a - b}")
}

class Class {
    fun average(a: Int, b: Int) = println("Class average 호출됨 ${(a + b) / 2}")
}

fun main(args: Array<String>) {

    //(Int, Int) -> Unit 함수 타입의 참조 변수 instantFunc을 선언
    var instantFunc: (Int, Int) -> Unit

    //plus 참조 값을 instantFunc 참조 변수에 저장 -> 함수 이름 앞에 ::를 붙이면, 표현식의 값은 그 함수의 참조값이 되며, 타입은 그 함수의 시그니처에 맞는 함수 타입이 된다.
    //즉 ::plus는 (Int, Int) -> Unit타입의 표현식이 됨
    instantFunc = ::plus

    //instantFunc 참조 변수가 가리키는 함수를 호출하고 있으니 plus함수가 호출 됨
    instantFunc(60, 27)

    //객체의 멤버 함수를 instantFunc 참조변수에 대입
    instantFunc = Object::minus
    instantFunc(36, 12)

    //클래스의 인스턴스의 멤버 함수를 instantFunc 참조 변수에 대입
    instantFunc = Class()::average
    instantFunc(25, 15)
}