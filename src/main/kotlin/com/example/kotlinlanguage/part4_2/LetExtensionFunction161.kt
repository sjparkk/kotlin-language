package com.example.kotlinlanguage.part4_2

/**
 * let 확장 함수 : 코드 중복 줄이기
 *
 * let 확장 함수를 통해 중복되는 표현식을 하나로 묶는 방법을 알아본다.
 *
 * let 확장 함수도 매개변수의 타입만 다를 뿐, run과 거의 유사한 역할을 한다.
 * let은 block 매개 변수로 (T) -> R 타입의 함수를 받는다. (T) -> R 과 T.() -> R은 서로 호환되는 타입이기 때문에 run과 let은 표기법만 다를 뿐 사실 똑같은 역할을 수행
 * inline fun <T, R> T.let(block: (T) -> R): R {
 *   return block(this)
 * }
 */
fun main(args: Array<String>) {

    val a= 10
    val b = 5

    //run 확장함수와는 다르게 (a * b - 2 * a) 표현식이 this로 들어가지 않고, 함수 리터럴의 첫번째 매개변수 즉 result 매개변수로 들어간다.
    (a * b - 2 * a).let { result: Int ->
        if(result > 0)
            println(result)
    }
}
