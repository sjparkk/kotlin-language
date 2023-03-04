package com.example.kotlinlanguage.part1_1

/**
 * 코틀린의 증감 연산자에 대해 배운다.
 *
 */
fun main(args: Array<String>) {

    // 코틀린의 증감 연산자는 다른 언너의 증감 연산자와 비슷
    var a = 10
    var b = 5

    //a++ 은 후위 연산이므로 10 + 5 가 되어 15
    println(a++ + b)

    //a++ 영향으로 11
    println(a)

    //전위 감소이므로 5-1 되어 4
    println(--b)

}