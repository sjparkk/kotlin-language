package com.example.kotlinlanguage.part4_2

/**
 * apply 함수 : 객체 생성 및 초기화 코드를 표현식 하나로 압축하기
 *
 * apply 함수를 통해 객체 생성과 객체 초기화 코드를 표현식을 한 개로 묶는 방법을 알아본다.
 *
 * 함수 내부를 보면 T.() -> Unit 타입의 함수를 block 매개변수로 받은 뒤 곧바로 호출하고 return this를 통해 바로 apply의 리시버를 반환한다.
 * inline fun <T> T.apply(block: T.() -> Unit): T {
 *   this.block()
 *   return this
 * }
 */
class Person {
    var name: String = ""
    var age: Int = 0
    var money: Int = 0

    override fun toString(): String {
        return "$name $age $money"
    }
}

fun main(args: Array<String>) {

    //인스턴스 생성 쉬 곧바로 apply 확장 함수 호출하여 갓 생성된 Person의 인스턴스에 추가적으로 name과 money 적용
    println(
        Person().apply {
            this.name = "Alan"
            this.money = 70
        }
    )//Alan 0 70

}