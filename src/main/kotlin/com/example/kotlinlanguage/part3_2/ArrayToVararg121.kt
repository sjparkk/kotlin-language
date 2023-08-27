package com.example.kotlinlanguage.part3_2

/**
 * 배열을 가변 인수로 활용하기
 *
 * 배열 안의 내용을 가변 인수로 넘길 수 있음을 이해한다.
 */

//가변 인수를 모두 출력하는 함수
fun printAll(vararg tokens: String) {

    for (token in tokens) {
        print("$token ")
    }
}

fun main(args: Array<String>) {

    val numbers: Array<String> = arrayOf("What's", "your", "name?")
    //배열 앞에 *을 찍으면 배열 속의 내용을 가변 인수로 활용할 수 있다.
    printAll(*numbers) //What's your name?
}