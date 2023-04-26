package com.example.kotlinlanguage.part2_1

/**
 * 상속
 *
 * 상속의 개념에 대해 알아본다.
 * 상속은 기존에 존재하는 클래스를 확장하여 새로운 클래스를 정의하는 기법
 */
class Inheritance64 {
}

/**
 * 책에는 없지만 아래에서 보듯이 상속을 하기 위해서는 open 키워드를 붙여줘야 하는데 상속이 필요할때마다 선언하기 번거롭기 때문에 코틀린에서는 all-open 플러그인을 등록해주면 번거로운 작업을 안해줘도 된다.
 */
//name과 age 프로퍼티를 갖는 Person 클래스
open class Person3(val name: String, val age: Int)

//Person 클래스를 상속하여 새로운 클래스 Student 정의
//기본적으로 클래스는 상속이 막혀있다. 상속을 허용하려면 open 키워드를 붙여주어야 함 -> Person에 open 키워드를 지우면 'This type is final, so it cannot be inherited from' 에러 발생
//코틀린은 자바와 달리 클래스 선언이 기본적으로 final로 되어 있기 때문
//: Person3(name, age) 이 부분이 상속하는 코드이며, 상속을 할때는 반드시 슈퍼클래스의 생성자를 호출해야 하기 때문에 Student 생성자 매개변수에 name과 age를 추가하여 이를 Person 생성자에 전달하게 했다.
class Student(name : String, age: Int, val id: Int): Person3(name, age)

fun main(args: Array<String>) {

    val person = Person("홍길동", 35)
    val student = Student("김길동", 23, 20171217)
}