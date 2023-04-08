package com.example.kotlinlanguage.part2_1

/**
 * 문자열간 + 연산 시 주의점
 *
 * String 타입 변수도 스택이 아닌 힙 영역에 실제 데이터가 생성된다는 것을 이해하고 문자열 간 + 연산 시 주의해야 할 점에 대해 알아본다.
 *
 * Person, Product 타입처럼 스택이 아닌 힙 영역에 실제 공간이 할당되는 타입을 '참조타입'이라고 한다.
 * 코틀린에서 Byte, Short, Int, Long, Float, Double, Char, Boolean 타입을 제외한 타입은 모두 참조 타입이다.
 * 지금까지 String 타입의 변수가 스ㄱ 영역에 문자열을 저장하는 것처럼 표현 했지만, 사실 실제 문자열은 힙 영역에 생성!
 * String 변수는 문자열의 참조값을 저장하기 위한 공간만 갖고 있다.
 */
fun main(args: Array<String>) {

    //스택영역에 first, 힙영역에 "Hello ", first == 참조변수
    var first = "Hello "
    //second도 first 와 마찬가지
    var second = "World"

    //first 변수에 first와 second가 가리키는 문자열을 합쳐 저장하고 있다.
    //이렇게 됐을 때 기존에 Hello를 저장하고 있는 힙영역에 World가 붙여지는 것이 아니라
    //기존의 Hello는 그대로 놔두고 합쳐진 문자열이 새로 생성되는 것!
    first += second

    //그렇다면 기존의 남겨진 Hello는 어떻게 되는가? 다음 50장에서 나옴 (가비지 컬렉션)
}