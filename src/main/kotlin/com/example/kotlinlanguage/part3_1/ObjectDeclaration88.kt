package com.example.kotlinlanguage.part3_1

/**
 * 객체 선언
 *
 * 프로그램 전체에서 공유 가능한 유일한 객체를 만들어 보자.
 */
//클래스를 선언하듯이 객체를 선언하고 있다. 이렇게 하면 Person이라는 식별자로 객체에 바로 접근할 수 있다.
object Person {
    var name: String = ""
    var age: Int = 0

    fun print() {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>) {
    //식별자 Person으로 객체에 바로 접근 가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()

    //Person은 타입 이름이기도 하기 때문에 다음 코드도 가능 -> 다만 선언된 객체에는 open 키워드를 붙일 수 없다.
    val person: Person = Person

    /**
     * object 키워드 덕에 자바에서 작성해야만 했던 싱글톤 패턴 코드를 더 이상 쓰지 않아도 되게 되었다.
     * 그저 일반 클래스를 선언하듯이 프로그램 전체에서 단 하나만 존재하는 객체를 편하게 만들 수 있다.
     */
}