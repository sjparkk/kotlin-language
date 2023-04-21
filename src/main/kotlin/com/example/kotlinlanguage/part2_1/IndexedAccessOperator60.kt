package com.example.kotlinlanguage.part2_1

/**
 * 번호 붙은 접근 연산자
 *
 * [] 연산자의 기능과 [] 연산자를 오버로딩하는 방법에 배운다.
 */
class IndexedAccessOperator60 {
}

class Person2(var name: String, var birthday: String) {

    //[]연산자를 오버로딩하는 멤버 함수 get을 선언하고 있다. position에 해당하는 위치의 프로퍼티 값을 반환하도록 했다.
    operator fun get(position: Int): String {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    //[]연산자를 오버로딩하는 멤버 함수 set을 선언하고 있다. position에 해당하는 위치의 프로퍼티 값을 value로 변경하도록 했다.
    operator fun set(position: Int, value: String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }
    }

}

fun main(args:Array<String>) {

    val person = Person2("Kotlin", "2016-02-15")

    //person[0]은 컴파일 시 person.get(0)으로 번역된다.
    println(person[0])
    println(person[1])
    println(person[-1])

    //컴파일 시 person.set(0, "java")로 번역된다.
    person[0] = "Java"
    println(person.name)
}