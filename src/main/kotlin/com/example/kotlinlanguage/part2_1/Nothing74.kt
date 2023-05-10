package com.example.kotlinlanguage.part2_1

/**
 * Nothing 타입
 *
 * Nothing 타입의 개념과 쓰임새를 알아본다.
 *
 * Nothing 타입은 실행 흐름이 도달할 수 없는 구역을 나타내기 위한 특수 타입이다.
 */
//throw Exception() 표현식은 Nothing 타입을 갖는다.
fun throwing(): Nothing = throw Exception()

fun main(args: Array<String>) {
    println("start")
    //Int 타입의 변수에 Nothing 타입의 표현식을 대입하고 있다.
    //Nothing 타입은 어떠한 타입과도 호환되기 때문이 이런 코드가 가능하다.
    //Int 타입에 Nothing 타입을 대입해도, throwing() 함수가 호출되면서 바로 예외가 던져져 강제 종료되므로 문제 x
    val i: Int = throwing()
    println(i)
}

/**
 * Nothing 타입은 어디에 활용할 수 있을까?
 *
 * - if 블록이 Int 타입, else 블록이 Nothing 타입이면, if-else는 Int 타입을 따라간다.
 * - if 블록이 Int 타입, else 블록이 Unit 타입이므로 서로 호환이 되지 않아 if-else를 표현식으로 쓸 수 없다.
 */
fun validate(num: Int) {
    val result: Int =
        if(num >= 0) num
        //throw Exception()은 Nothing 타입의 표현식이기 때문에 if-else 블록이 Int 타입의 표현식으로 인식된다.
        //만약 else 블록이 throw Exception()이 아니었다면 타입이 Unit으로 되어 if-else 표현식을 쓸 수 없게 된다.
        //Nothing 타입은 throw를 표현식으로 쓸 수 있게 하기 위한 장치이다.
        else throw Exception("num이 음수입니다.")
}

class Nothing74 {
}