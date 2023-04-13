package com.example.kotlinlanguage.part2_1

/**
 * 생성자와 초기화 블록
 *
 * 객체를 생성과 동시에 원하는 값으로 초기화하는 방법을 알아본다.
 *
 * 객체를 생성하고 난 뒤 프로퍼티에 값을 채워 넣는 작업은 법거롭다. 생성자를 사용하면 객체를 생성함과 동시에 원하는 값으로 한번에 초기화가 가능하다.
 * 생성자는 객체를 초기화하는 특수 멤버 함수이다.
 */
//이때 constructor 키워드는 생략 가능하다. 추가적으로 생성자도 함수의 일종이므로 디폴트 인수와 가변 인수를 사용할 수 있다.
class Person constructor(name: String, age: Int) {
    val name: String
    val age: Int

    //생성자의 매개변수는 init 블록 내부에서 사용할 수 있다. init 블록 안에서 프로퍼티를 초기화하면 프로퍼티를 선언과 동시에 초기화하지 않아도 된다.
    //클래스에 아무런 생성자를 정의하지 않으면 매개변수가 없는 기본 생성자가 자동으로 정의된다 (만약, 매개변수가 있는 생성자를 정의하면 매개변수가 없는 기본 생성자는 자동으로 정의되지 않는다.)
    init {
        this.name = name
        this.age = age
    }
}

fun main(args: Array<String>) {

    //코틀린의 생성자는 자바의 생성자와 달리 매우 특이하게 생겼다. 어차피 생성자의 이름과 클래스의 이름은 동일하므로
    //코틀린에서는 생성자 정의부를 아예 클래스 이름에 합쳐버렸기 때문이다. (코틀린의 간격함)
    val person = Person("홍길동", 46)
    println("이름:${person.name}")
    println("나이:${person.age}")
}