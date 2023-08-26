package com.example.kotlinlanguage.part3_2

/**
 * 배열
 *
 * 타입이 같은 변수를 여러 개 선언하는 방법에 대해 알아본다.
 */
//배열은 타입이 같은 변수를 여러 개 만들 때 사용하며, 다음과 같이 선언되어 있다.
/**
 class Array<T> {
    //배열의 원소 개수를 나타냄
    val size: Int

    //get set 연산자 멤버 함수는 배열을 [] 연산자로 접근할 수 있게 해준다
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T): Unit

    //iterator 연산자 멤버 함수는 배열을 for 문에 쓸 수 있게 해준다
    operator fun iterator(): Iterator<T>
 */

fun main(args: Array<String>) {

    //arrayOf 함수를 통해 배열을 만들 수 있다. -> 가변 인수를 받을 수 있도록 되어 있어 제네릭이 적용되어 있다.
    //public inline fun <reified @PureReifiable T> arrayOf(vararg elements: T): Array<T>
    val integers: Array<Int> = arrayOf(10, 20, 30, 40)

    println(integers.size) // 4
    println(integers[1]) // 20

    for (i in integers) {
        print("$i ") // 10 20 30 40
    }
}
