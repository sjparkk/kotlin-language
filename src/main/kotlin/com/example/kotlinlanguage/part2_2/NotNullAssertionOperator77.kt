package com.example.kotlinlanguage.part2_2

import com.example.kotlinlanguage.part2_1.Building

/**
 * Not-null 단정 연산자 !!
 *
 * Nullable 타입을 Not-null 타입으로 변환하는 방법을 배운다.
 */
fun main(args: Array<String>) {
    var obj: Building? = Building()

    //!! 연산자는 Nullable 타입을 Not-null 타입으로 강제로 캐스팅한다.
    //obj!!는 Building 타입이다. obj 가 null 이 아니기 때문에, obj!!는 무사히 Building 타입으로 캐스팅된다.
    obj!!.name = "서울시청"
    println(obj!!.name)

    //obj에 고의로 null을 지정하고 있다.
    obj = null

    //obj은 null이기 때문에 KotlinNullPointerException 예외가 발생
//    obj!!.print()
}