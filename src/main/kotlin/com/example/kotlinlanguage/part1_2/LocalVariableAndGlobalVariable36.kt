package com.example.kotlinlanguage.part1_2

/**
 * 지역 변수와 전역 변수, 그리고 변수의 유효 범위(Scope)에 대해 알아본다.
 *
 * 함수 안에 선언한 변수에는 수명이 있다. 변수의 수명과 프로그램이 종료될 때까지 유지되는 변수에 대해 알아본다.
 */

//함수 밖에서 선언한 변수는 함수 호출이 끝나도 사라지지 않는다. -> 전역 변수 (Global Variable)
//전역 변수는 어떤 함수에도 속해있지 않기 때문에 모든 함수에서 사용할 수 있다.
var count = 0

fun main(args: Array<String>) {

    //반면 블록 안에서 선언한 변수는 블록 밖으로 나가면 사라진다. -> 지역 변수 (Local Variable)
    //지역변수는 그 변수가 속한 지역, 즉 변수가 선언된 블록 안에서만 인식된다.
    //여기서 변수가 인식될 수 있는 범위를 '스코프(Scope)'라 한다.
    val a = 15
    println(a)

    count += 1
    printCount()
    println(count)

}

fun printCount() {
    // main 함수에 대한 지역 변수이므로 여기서는 사용 불가능.
    //a = 1

    println(count)
    count += 1
}

//a 의 스코프는 main 함수 내
//count 의 스코프는 전체


