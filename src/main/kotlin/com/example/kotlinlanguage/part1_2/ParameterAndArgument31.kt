package com.example.kotlinlanguage.part1_2

/**
 * 함수를 호출하면서 값을 전달하는 방법을 배운다.
 *
 * 함수는 고정된 문장으로 이루어져 있기 때문에 기본적으로 다양한 기능을 기대할 수 없다.
 * 하지만 함수에 값을 전달하면 함수가 다양한 일을 수행할 수 있게 만들 수 있다.
 */
fun main(args: Array<String>) {

    //cToF 함수의 매개변수에 저장되는 표현식 30을 인수라고 한다.
    println(cToF(30))
    println(getAverage(89, 96))

}

//소괄호 안에 선언한 변수는 매개변수라고 부른다. -> Parameter
//매개변수는 함수를 호출한 곳으로부터 값을 전달받을 때 사용
//매개변수는 따로 var or val 키워드를 붙이지 않는다. 이유는 무조건 val로 선언되기 때문이다.
fun cToF(celsius: Int): Double {
    return celsius * 1.8 + 32
}

fun getAverage(a: Int, b: Int): Double {
    return (a + b) / 2.0
}