package com.example.kotlinlanguage.part1_1

/**
 * if 문의 조건이 false일 때 실행할 문장을 지정하는 방법을 배운다
 *
 * else는 if와 짝이 되는 키워드이다. 따러서 if가 나오고 난 다음에만 else를 사용할 수 있다.
 */
fun main(args: Array<String>) {

    val a = 10
    val b = 5

    //if부터 else 까지는 하나의 문장으로 인식 -> if 하고 else는 분리된 요소가 아님
    if(a < b)
        println("if")
    else // 실행
        println("else")

    if(a > b) // 실행
        println("a 가 크다.")
    else
        println("b 는 a 이상이다.")


}