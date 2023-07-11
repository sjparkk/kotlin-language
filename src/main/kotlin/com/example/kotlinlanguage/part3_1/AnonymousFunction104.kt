package com.example.kotlinlanguage.part3_1

/**
 * 익명 함수
 *
 * 함수 리터럴을 표현하는 또 다른 방식인 익명 함수에 대해 알아본다.
 */

fun main(args: Array<String>) {

    //익명 함수 형태 -> 익명함수는 함수의 이름이 없다는 점만 뺴면 일반 함수와 형태가 거의 동일하다 (익명 함수에는 inline 같은 키워드를 붙일 수 없다. 이것이 일반 함수와의 차이점)
    //익명 함수는 람다식보다 복잡하지만, return으로 반환 값을 직접 지정 가능하여 마지막 표현식이 자동으로 반환 값이 되어버리는 람다식보다 버그를 일으킬 확률이 적다
    val instantFunc: (Int) -> Unit = fun(number: Int): Unit {
        println("Hello $number")
    }
    instantFunc(33)
    instantFunc.invoke(33)
}