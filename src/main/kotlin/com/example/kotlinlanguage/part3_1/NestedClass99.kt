package com.example.kotlinlanguage.part3_1

/**
 * 중첩 클래스
 *
 * 클래스 안에 클래스를 선언하는 방법을 알아본다.
 */
class Outer1(private val value: Int) {

    //클래스 안에 또 다른 클래스를 선언할 수 있다.
    class Nested {
        fun hello() {
            println("중첩된 클래스")
        }
    }

    //Nested 클래스는 Nested라는 식별자만 Outer 클래스에 속해 있을 뿐, 실제로는 완전히 분리된 장소에 있다.
    //따라서 Nested 클래스의 멤버 함수는 Outer 클래스의 프로퍼티나 멤버 함수에 접근할 수 없다.! -> 완전히 별개의 클래스
}

fun main(args: Array<String>) {

    //중첩 클래스는 타입 이름이 바깥 클래스.중첩 클래스로 만들어 진다. 생성자 이름도 마찬가지이다.
    val instance: Outer1.Nested = Outer1.Nested()
    instance.hello()

}