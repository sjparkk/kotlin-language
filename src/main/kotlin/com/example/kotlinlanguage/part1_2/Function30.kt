package com.example.kotlinlanguage.part1_2

/**
 * 작업의 기본 단위가 되는 함수에 대해 알아본다.
 */
fun main(args: Array<String>) {

    //함수이름()을 적으면 그 줄이 실행되는 순간 해당 함수 속에 들어있던 문장들이 순차적으로 실행되며, 이를 보고 함수를 호출(Call)한다고 함.
    //여기서는 println 함수를 호출하면서 myFunction 함수도 호출 -> 가장 안쪽에 있는 함수가 먼저 호출 됨
    println(myFunction())
    println(myFunction() + 10)
}

/**
 * myFunction이라는 함수를 선언
 * 해당 코드로 인해 myFunction이라는 식별자는 함수로 인식 됨
 *
 * fun 식별자(): 반환 타입 {
 *  함수에 포함시킬 문장
 * }
 */
fun myFunction(): Int {
    val a = 3
    val b = 6

    println("a : " + a + ", b: " + b)
    return a + b
}

/**
 * 다음은 함수를 간단히 쓰는 예시를 알아본다.
 */
//함수 블록의 문장이 하나일 경우 한 줄로 축약 가능
fun function(): Double {
    return 3.0 + 7
}

// = 로도 가능
fun functionA(): Double = 3.0 + 7

// 반환 타입까지 생략도 가능 -> 타입 추론이 가능하므로
fun functionB() = 3.0 + 7
