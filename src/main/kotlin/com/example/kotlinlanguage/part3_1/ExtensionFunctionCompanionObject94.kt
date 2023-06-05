package com.example.kotlinlanguage.part3_1

/**
 * 동반자 객체의 확장 함수
 *
 * Companion 식별자를 이용하여 동반자 객체에도 확장 함수를 달 수 있음을 이해한다.
 */

//확장 함수를 다음과 같이 선언하면 동반자 객체에도 확장함수를 달 수 있다.
/**
 fun 클래스 이름.Companion.함수 이름() {

 }
 */

//동반자 객체는 클래스 이름만으로 접근할 수 있지만, 확장 함수를 선언할 때 그렇게 하면 동반자 객체가 아닌 클래스 자체에 멤버 함수가 추가되므로 Companion 식별자를 반드시 적어줘야 한다.

//동반자 객체에 확장 함수를 주입하기 위해 빈 동반자 객체를 정의 -> 동반자 객체도 내용이 비어 있으면 중괄호를 생략할 수 있다
class Person2 {
    companion object
}

//동반자 객체에 create 함수를 주입하고 있다
fun Person2.Companion.create() = Person2()

fun main(args: Array<String>) {
    //Perosn2 클래스의 동반자 객체에 주입된 create 함수를 호춣하고 있다.
    Person2.create()
}