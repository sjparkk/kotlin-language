package com.example.kotlinlanguage.part5

/**
 * 코틀린에서 자바 코드 접근하기: Getter/Setter
 *
 * 자바의 Getter/Setter를 코틀린에서 어떻게 접근할 수 있는지 알아본다.
 * 일정 규칙을 만족하는 자바 메서드는 코틀린에서 프로퍼티로 접근할 수 있다.
 */
fun main(args: Array<String>) {

    //자바 클래스의 인스턴스 생성
    val java = JavaClass1()

    //자바 클래스에 get.. set.. 으로 시작하는 메서드가 있다면 코틀린에서 프로퍼티로 접근이 가능하다.
    //something 은 int 타입의 값을 다루므로 Int 타입의 프로퍼티로 인식된다.
    java.something = 301
    println(java.something)

    //is 로 시작하고 반환 타입이 boolean인 메서드가 있다면 이 또한 프로퍼티로 접근이 가능하다.
    println(java.isGood)
    //Getter만 있어도 프로퍼티 접근 가능
    println(java.doubleValue)
}