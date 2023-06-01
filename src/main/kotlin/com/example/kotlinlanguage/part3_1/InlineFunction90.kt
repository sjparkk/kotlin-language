package com.example.kotlinlanguage.part3_1

/**
 * 인라인 함수
 *
 * 함수 호출문이 함수 속에 들어있는 문장으로 대체되는 inline 함수에 대해 알아본다.
 */

//함수를 호출하면 함수 속으로 실행 흐름이 점프하고, 함수가 끝나면 함수를 호출했던 지점으로 다시 점프한다.
//이때 발생하는 실행 흐름의 이동은 프로그램의 성능을 미세하게 저해한다.

//inline함수를 사용하면, 실행 흐름을 점프하지 않고 함수 호출문을 함수의 몸체로 대체하기 때문에 성능을 조금이나마 개선할 수 있다.

//함수 앞에 inline 키워드를 붙이면 그 함수는 inline함수가 된다.
inline fun hello() {
    println("Hello")
    println("Kotlin")
}

fun main(args: Array<String>) {

    //inline 함수를 호출하면 이 함수 호출문들은 컴파일 되는 순간 아래처럼 코드가 대체된다.
    hello()
    hello()
    hello()

}

/**
 * 대체 코드 -> inline 함수가 성능을 개선시켜준다는 말에 이 참에 inline 함수로 바꿔볼까 생각한다면 그러지 않는 편이 좋다.
 * 이유는 inline 함수는 함수 속의 문장을 재활용하지 않기 때문에, 문장이 많은 함수를 inline으로 바꾸면 프로그램의 크기가 기하급수적으로 늘어 안 쓰느니만 못하게 된다.

fun main(args: Array<String>) {

    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")
    println("Hello")
    println("Kotlin")

 }
 */