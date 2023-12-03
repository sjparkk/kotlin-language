package com.example.kotlinlanguage.part5

/**
 * 코틀린에서 자바 코드 접근하기: 클래스 참조
 *
 * 코틀린 클래스의 인스턴스로부터 Class<T> 타입의 값을 얻어대는 방법을 알아본다.
 *
 * 자바로 된 메서드를 호출하다보면 간혹 Class<T> 타입의 인수를 요구하는 경우가 있다.
 * 이때, 코틀린 클래스의 인스턴스로부터 Class<T> 타입의 값을 얻어내는 방법을 알아보자.
 */
fun main(args: Array<String>) {

    val number: Int = 26
    val str: String = "2018년"

    //인스턴스 뒤에 ::class.java를 적으면 자바와 호환되는 Class<T> 타입의 객체를 가져온다.
    JavaClass3.printClassInfo(number::class.java) // int
    JavaClass3.printClassInfo(str::class.java) // java.lang.String
    JavaClass3.printClassInfo(Double::class.java) // double

}

