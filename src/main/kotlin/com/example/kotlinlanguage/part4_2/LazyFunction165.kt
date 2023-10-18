package com.example.kotlinlanguage.part4_2

/**
 * lazy 함수: 게으른 초기화를 하는 프로퍼티 대리자
 *
 * lazy함수를 이용하여 프로퍼티에 게으른 초기화를 적용해보자
 * lazy함수를 이용하면 프로퍼티의 값이 필요한 시점에 계산을 시작하게 할 수 있다.
 */

class AAA {
    var num: Int = 0
    val num2 by lazy { num * 5 }

    /**
     * fun <T>lazy(initializer: () -> T): Lazy<T>
     */
}

fun main(args: Array<String>) {

    val one = AAA()

    //one.num2 에 접근하는 순간 {num * 5} 실행된다. 이 시점에 num에는 0이 있으므로 num2는 0으로 초기화 된다.
    println(one.num2) // 0
    one.num = 10

    //one.num을 통해 10으로 수정되었지만 num2는 이미 초기화 되었으므로 {num * 5}가 실행되지 않고 저장된 값 0만 출력된다.
    println(one.num2) // 0

    val two = AAA()
    two.num =  4

    //이 시점에는 num에 4가 있으므로 20이 출력된다.
    println(two.num2) // 20

    //위 예제처럼 게으른 초기화를 하면 값이 필요한 시점에 계산이 시작되므로 최근 시점 데이터를 반영할 수 있다.
}
