package com.example.kotlinlanguage.part2_2

import com.example.kotlinlanguage.part2_1.Person
import com.example.kotlinlanguage.part2_1.Person3
import com.example.kotlinlanguage.part2_1.Student

/**
 * is 연산자
 *
 * 참조 변수가 어떤 클래스의 인스턴스를 가리키고 있는지 확인하는 방법을 배운다.
 */
class Professor(name: String, age: Int): Person3(name, age)

fun main(args: Array<String>) {
    val person: Person3 = Student("Mark", 33, 20171225)

    //is 연산자로 참조 변수가 실제로 가리키고 있는 객체의 타입을 알아낼 수 있다.
    //is 연산자는 왼쪽 피연산자가 실제로 가리키고 있는 객체를 오른쪽 피연산자로 가리킬 수 있는지 여부를 조사한다.
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")

    //코틀린의 is는 자바의 instanceof에 해당된다.

    //코틀린에 when에서 is는 다음과 같이 사용할 수 있다.
    when(person) {
        is Person -> {}
        is Student -> {}
        is Professor -> {}
    }
}


