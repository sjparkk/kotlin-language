package com.example.kotlinlanguage.part4_1

/**
 * Progression과 관련된 함수
 *
 * 코틀린에 내장된 확장 함수를 통해 Progression 타입들을 다루는 방법을 배운다.
 */

fun IntProgression.print() {

    print("first: ${this.first}, ")
    print("last: ${this.last}, ")
    println("step: ${this.step}")
}

fun main(args: Array<String>) {

    //downTo 역순으로 반환 -> 7 .. 3 처럼 .. 연산자는 작은 값 .. 큰 값 밖에 사용하지 못하여서 감소를 하려면 downTo를 사용해야 한다.
    //first: 7, last: 3, step: -1
    val prog: IntProgression = 7 downTo  3
    prog.print()

    //reversed확장 함수는 원래의 Progression을 뒤집는 역할
    //first: 7, last: 3, step: -1
    val prog2: IntProgression = (3..7).reversed()
    println(prog == prog2) // true
    prog2.print()

    //first: 1, last: 10, step: 3 -> 1 4 7 10 으로 진행됨
    val prog3: IntProgression = (1..10) step 3
    prog3.print()

    //first: 10, last: 4, step: -3 -> 여기서 주의점은 값이 감소한다고 해서 step 의 음수(-3)을 넘기면 안된다. step으로 전달되는 값은 항상 양수여야 한다.
    val prog4: IntProgression = 10 downTo  2 step 3
    prog4.print()

    //first: 2, last: 4, step: 1 -> until은 시작을 포함하며 끝은 포함하지 않는다.
    val prog5: IntProgression = 2 until 5
    prog5.print()
}