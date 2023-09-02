package com.example.kotlinlanguage.part3_2

/**
 * 클래스 위임
 *
 * 인터페이스의 구현을 다른 클래스에 맡기는 방법을 알아본다.
 */

//코틀린에서는 인터페이스의 구현을 다른 클래스에 맡길 수 있는 문법도 제공한다.

//Int 타입과 덧셈을 가능하게 하는 인터페이스를 선언하고 있다.
interface Plusable1 {
    operator fun plus(other: Int): Int
}

//Plusable1 인터페이스를 구현하는 클래스를 선언하고 있다.
class ClassDelegator: Plusable1 {

    override fun plus(other: Int): Int {
        println("기본 구현")
        return other
    }
}

//인터페이스를 구현하면서 뒤에 by 객체를 지정하면 인터페이스의 구현을 해당 객체로 위임한다.
//이때 객체는 대리할 인터페이스를 구현하고 있어야 한다.
class Sample1: Plusable1 by ClassDelegator()

fun main(args: Array<String>) {

    //Sample의 plus 연산자 멤버함수를 호출하면 ClassDelegator의 plus가 호출된다.
    println(Sample1() + 10)
}