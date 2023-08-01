package com.example.kotlinlanguage.part3_1

/**
 * 클래스와 인터페이스에서 재네릭 사용하기
 *
 * 클래스와 인터페이스에서 타입을 인수로 받는 방법을 알아본다
 */

//클래스나 인터페이스에서 타입을 인수로 받으려면 선언 시 이름 옆에 <식별자>를 붙인다.
class Pair<A, B>(val first: A, val second: B) {
    //모든 타입은 Any 클래스를 상속하므로, 어떤 타입이 오더라도 toString 멤버 함수를 가지고 있다는 것이 보장된다.
    override fun toString(): String = "$first\n$second"
}

fun main(args: Array<String>) {

    //제네릭이 적용된 클래스와 인터페이스에는 이름 옆에 <타입 인수>를 붙여야 한다.
    //Pair<Int, Double>은 하나의 고유한 타입으로 취급하기 때문에 Pair<Int, Int>와는 서로 다른 타입이다.
    val pair: Pair<Int, Double>

    //타입 추론이 가능하여 생략 가능하다.
    pair = Pair<Int, Double>(15, 9.12)
    println(pair.toString())
}