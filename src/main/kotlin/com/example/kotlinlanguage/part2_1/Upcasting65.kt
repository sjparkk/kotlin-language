package com.example.kotlinlanguage.part2_1

/**
 * 업캐스팅
 *
 * 캐스팅과 업캐스팅의 개념에 대해 알아본다.
 * 캐스팅 또는 형변환이란, 특정 타입을 다른 타입으로 변환하는 것을 뜻함.
 * 코틀린에서는 서브클래스의 인스턴스를 슈퍼클래스 타입으로 가리킬 수 있다.
 */
open class Person4(val name: String, val age: Int)

class Student1(name: String, age: Int, val id: Int) : Person4(name, age)

fun main(args: Array<String>) {

    //Student의 인스턴스를 생성하고, Person 타입의 참조 변수로 가리키고 있다.
    //Student 클래스는 Person 클래스의 모든 프로퍼티와 멤버함수를 포함하기 때문에 가능하다.
    //이렇게 서브 클래스의 인스턴스를 슈퍼클래스 타입으로 가리키는 것을 '업캐스팅' 이라고 한다.
    val person: Person4 = Student1("John",32,20171218)

    //Type mismatch: inferred type is Person but Student was expected(타입 불일치 추론된 타입은 Person이나 Student가 와야한다)
    //슈퍼클래스 타입은 항상 슈퍼클래스 자체나 서브클래스의 인스턴스만 가리킬 수 있다.
//    val student: Student1 = person
}

