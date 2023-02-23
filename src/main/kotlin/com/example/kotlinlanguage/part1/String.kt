package com.example.kotlinlanguage.part1

/**
 * 여러 개의 문자를 저장할 수 있는 타입에 대해 배운다.
 *
 * 문자열은 문자(char)들을 일렬로 나열한 것.
 */
fun main(args: Array<String>) {

    //0번 'H', 1번 'e', 2번 'l', 3번 'l', 4번 'o'
    var str: String = "Hello"
    println(str)

    //str[5] -> '\n'
    // 다음과 같이 + 연산자를 통해서 문자열에 덧붙일 수 있음
    str = str + "\nKotlin!"
    println(str)

    println(str[8])

    //num 53은 문자열로 변하고 그대로 합쳐짐.
    val num = 10 * 5 + 3
    println(str + num)

}