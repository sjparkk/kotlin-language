package com.example.kotlinlanguage.part3_1

/**
 * 객체 분해하기
 *
 * 객체를 여러 개의 변수로 쪼개는 방법을 알아본다.
 */

//데이터 클래스의 인스턴스에 한해, 객체를 여러 개의 변수로 쪼개는 것이 가능하다.
data class Employee3(val name: String, val age: Int, val salary: Int)

fun main(args: Array<String>) {

    //Employee3는 data class이므로 Employee3 타입의 표현식을 여러 변수로 쪼갤수 있다.
    val (name, _, salary) = Employee3("John", 30, 3300)

    //사용하지 않는 변수의 이름은 언더스코어를 지정하여 무시가 가능하다.
    println(name); println(salary)
}