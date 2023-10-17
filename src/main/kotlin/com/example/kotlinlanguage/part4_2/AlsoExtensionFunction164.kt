package com.example.kotlinlanguage.part4_2

/**
 * also 함수: 객체 생성 및 초기화 코드를 표현식 하나로 압축하기
 *
 * also 함수를 통해 객체 생성과 객체 초기화 코드를 표현식 한개로 묶는 방법을 알아본다.
 * also 확장 함수는 apply와 매개변수 타입만 다를 뿐, 동일한 역할을 수행한다.
 *
 * 매개 변수의 타입이 T.() -> Unit 에서 (T) -> Unit으로 바뀌었을 뿐 코드는 apply와 사실상 동일하다
 * fun <T> T.also(block: (T) -> Unit):T {
 *   block(this)
 *   return this
 * }
 */
class Person2 {
    var name: String = ""
    var age: Int = 0
    var money: Int = 0

    override fun toString(): String {
        return "$name $age $money"
    }
}

fun main(args: Array<String>) {

    //apply와 차이점은 Person()의 표현식이 this로 들어가지 않고, 함수 리터럴의 첫번째 매개변수, 즉 person2 매개변수로 들어간다.
    println(
        Person2().also { person2: Person2 ->
            person2.name = "Alan"
            person2.money = 70
        }
    )
}