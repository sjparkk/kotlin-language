package com.example.kotlinlanguage.part1_2

/**
 * 지역 변수와 다른 함수의 지역 변수가 중복될 때
 *
 * 변수가 속한 함수가 다를 때도 스코프가 다르기 때문에 변수의 이름이 중복돌 수 있음을 이해한다.
 *
 * 지역 변수의 이름은 같은 스코프 내에서만 중복되자 않으면 되기 때문에 서로 다른 함수 안에 같은 이름의 변수가 존재할 수 있다.
 */
fun main(args: Array<String>) {

    // 함수 main, printA, printA2 모두 각각의 스코프를 가지므로 각 함수의 a 변수명은 이름이 같아도 문제가 되지 않는다.
    // 이 변수들은 이름만 같을뿐 완전히 서로 다른 변수이다.
    val a = 52
    println(a)

    printA()
    printA2()

}

fun printA() {
    val a = 17
    println(a)
}

fun printA2() {
    val a = 120
    println(a)
}