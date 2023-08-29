package com.example.kotlinlanguage.part3_2

/**
 * 열거 클래스에 프로퍼티와 멤버 함수 선언하기
 *
 * 열거 클래스도 일반 클래스처럼 프로퍼티와 멤버 함수를 포함할 수 있다는 것을 배운다.
 */

//일반 클래스처럼 생성자 매개변수에서 프로퍼티를 선언하고 있다.
enum class Mode1(val number: Int) {

    //열거 클래스에 생성자가 있으면, 열거 상수 각각에 인수를 적어 생성자를 호출해야 한다.
    //열거 상수 각각이 열거 클래스의 인스턴스라고 생각하면 된다.
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3); //마지막 열거 상수에는 끝에 세미콜론을 반드시 붙여야 한다.

    //열거 클래스에 멤버 함수 선언, 열거 클래스의 프로퍼티나 멤버 함수는 반드시 열거 상수 나열문 보다 뒤에 와야한다.
    fun printNumber() {
        println("모드:$number")
    }
}

fun main(args: Array<String>) {

    //현재 선택된 모드
    val mode: Mode1 = Mode1.ERASER

    println(mode.number)
    mode.printNumber()
}