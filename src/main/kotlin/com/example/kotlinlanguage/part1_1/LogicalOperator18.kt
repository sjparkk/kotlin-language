package com.example.kotlinlanguage.part1_1

/**
 * 논리 연산을 수행하는 연산자에 대해 배운다.
 *
 * 논리 연산자는 참과 거짓으로만 게산을 수행하는 연산자이다.
 * && - a && b - a와 b 모두 true면 true, 둘 중 하나라도 아니면 false
 * || - a || b - a와 b 하나라도 true면 결과 값은  true, 둘 다 false면 false
 * ! - 결과 값 반대로, 프로그래밍 언어에서 ! 은 보통 Not의 의미로 사용
 */
fun main(args: Array<String>) {

    val a = 15
    val b = 17

    // true && true
    var bool: Boolean = (a - b < a + b) && (a == 15)
    println(bool) // true

    // !(false || true)
    // !true -> false
    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool)//false

    // 5 < a < 15 --> x
    // 5 < a && a < 15 --> o

}