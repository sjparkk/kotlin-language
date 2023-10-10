package com.example.kotlinlanguage.part4_2

/**
 * run 확장 함수 : 코드 중복 줄이기
 *
 * run 확장 함수를 통해 중복되는 표현식을 하나로 묶는 방법을 알아본다.
 *
 * 리시버 타입에 제네릭이 적용되어 있기 때문에 run 확장 함수는 모든 타입에 적용할 수 있다.
 * block 매개 변수로 T.() -> R 형태의 함수를 받는데, run 확장 함수를 호출하면 곧바로 this.block()을 호출하여, run의 리시버를 block이 가리키는 함수에 전달한다.
 * inline fun <T, R> T.run(block: T.() -> R) R {
 *     return this.block()
 * }
 *
 * ex) "Hello".run { println(this) }와 같이 호출하면 run 확장 함수는 다음과 같이 된다.
 * fun String.run(block: String.() -> Unit): Unit {
 *    //block = { println(this) }
 *    return this.block()
 * }
 */
fun main(args: Array<String>) {
    val a = 10
    val b = 5

    //run 확장 함수의 리시버로 (a * b - 2 * a)을 지정
    (a * b - 2 * a).run {

        //그렇기 떄문에 this는 (a * b - 2 * a)의 값을 가리킨다.
        if(this > 0)
            println(this)

        /**
         * 다음코드와 동일하며, run 확장 함수 덕에 중복되는 표현식을 this로 묶을 수 있다.
         * if((a * b - 2 * a) > 0)
         *   println((a * b - 2 * a))
         */

    }
}