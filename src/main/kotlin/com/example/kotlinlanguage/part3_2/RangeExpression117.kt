package com.example.kotlinlanguage.part3_2

/**
 * .. 연산자와 범위 표현식
 *
 * 범위를 반환하는 연산자에 대해 알아본다.
 */

// .. 연산자는 범위를 표현하는 연산자이다.
fun main(args: Array<String>) {

    //..연산자는 operator fun rangeTo(매개변수: 자유 타입): 자유 타입으로 오버로딩 할 수 있다.
    //즉 1..10 은 1.rangeTo(10)으로 컴파일되며 IntRange타입의 값이 반환된다.
    val oneToTen: IntRange = 1..10
    //true 출력
    println(5 in oneToTen)

    val upperAtoZ: CharRange = 'A' .. 'Z'
    if('C' in upperAtoZ)
        println("대문자입니다.")

    if('p' in 'a' .. 'z')
        println("소문자입니다.")

    //이처럼 어떤 값이 특정 범위에 들어있는지 조사할때 .. 연산자를 쓰면 좋다.
    //if(0 <= num && num <= 100) 이렇게 쓰는것보다 if(num in 0..100) 다음과 같이 쓰는것이 자연어에 가깝기 때문에 읽기도 쉽고 코드도 짧아짐
}