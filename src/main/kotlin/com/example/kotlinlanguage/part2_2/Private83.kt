package com.example.kotlinlanguage.part2_2

/**
 * 접근 지정자 : private
 *
 * private 접근 지정자의 효과를 살펴보자
 */

private var num = 10 // Private83.kt 파일 내에서만 접근 가능

private fun print() // Private83.kt 파일 내에서만 접근 가능
    = println(num)

public fun hello(value: Int) // 어디에서나 접근 가능
{
    num = value
    print()
}

public class Person(age: Int) // 어디에서나 접근 가능
{

    //디폴트 Setter 를 private 으로 지정. Setter는 Person 클래스 내부에서만 접근 가능
    public var age = age
        private set

    //Getter를 public으로 지정. Getter는 어디에서나 접근 가능
    public val isYoung public get() = age < 30

    //접근 지정자 테스트 위한 전역 변수, 함수, 클래스를 선언하고 있다.
}

fun main(args: Array<String>) {

    //num = 5 //에러 -> num은 private 이기 때문에 Private83.kt 파일 외부에서 접근하면 오류 발생

    //public이므로 접근 가능
    hello(15)

    val person  = Person(10)
    println(person.age)
    //person.age = 20 // 에러

    println(person.isYoung)
}