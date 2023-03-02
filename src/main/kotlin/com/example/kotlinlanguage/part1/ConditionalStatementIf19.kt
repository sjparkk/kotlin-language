package com.example.kotlinlanguage.part1

/**
 * 조건에 따라 문장을 실행할지 말지 결정하는 if문에 대해 배운다.
 *
 * Boolean 타입과 비교/논리 연산자는 조건문 if에서 쓰임
 */
fun main(args: Array<String>) {

    var a = 15
    val b = 11

    //() -> 조건, { } 블록
    //if문은 몇 줄의 문장을 포함하고 있든 간에 무조건 하나의 문장으로 인식 (else, when, while 도 마찬가지)
    if(a > b) { //-> 문장이 하나일 때 중괄호({}) 생략 가능
        println("if 안으로 들어옴")
        a -= b
    }

    println(a)


}