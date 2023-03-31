package com.example.kotlinlanguage.part1_3

//import 패키지 이름.함수 이름을 적으면 패키지 이름 없이 호출 가능
//추가적으로 패키지 이름.* 과 같이 적으면 그 패키지에 들어있는 모든 함수를 패키지 이름 없이 호출할 수 있다.
import com.example.kotlinlanguage.ex_package.max

//as를 사용하면 새로운 이름으로 해당 함수를 호출할 수 있다.
import com.example.kotlinlanguage.ex_package.min as newMin

/**
 * Import
 *
 * 패키지 이름 없이 다른 패키지에 선언된 함수를 호출하는 방법을 알아본다.
 *
 * 다른 패키지에 선언된 함수를 호출할 때마다 매번 패키지 이름을 적는 것은
 * 번거롭기 때문에 import 키워드를 사용하면 다른 패키지에 선언된 함수를 패키지 이름 없일 호출할 수 있다.
 *
 */

fun main(args: Array<String>) {
    println(max(55, 47))

    println(newMin(55,33))
}