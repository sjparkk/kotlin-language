package com.example.kotlinlanguage.part3_1

/**
 * 구체화된(Reified) 타입 매개변수
 *
 * 구체화 된 타입 매개변수가 무엇이고, 어디에 사용하는지 알아본다.
 */

//타입 매개변수는 대부분의 상황에서 일반 타입처럼 쓸 수 있지만, 특정 상확에서는 그렇지 못하다.
//다음 코드는 오류를 일으킨다.
fun <T> check() {
    val number = 0

    //Cannot check for instance of erased type: T
//    if(number is T) { -> 매개변수는 is 연산자의 피연산자로 사용할 수 없다.
//        println("T는 Int 타입입니다.")
//    }
}

//사용을 하고 싶다면 다음과 같이 해야한다.
//다음과 같이 타입 매개변수 앞에 reified를 붙여주면 해당 타입 매개변수를 in 연산자에 사용할 수 있다.
//추가적으로 타입 매개변수에 reified를 붙이려면 함수를 반드시 inline으로 선언해야 한다.
inline fun <reified T> check1() {
    val number = 0
    if(number is T) {
        println("T는 Int 타입입니다.")
    }
}

fun main(args: Array<String>) {
    check1<Int>()
}