package com.example.kotlinlanguage.part1_2

/**
 * 이름이 중복되는 함수를 작성할 수 있음을 이해한다.
 *
 * println() 도 함수이다. println의 코드를 살펴보며 함수 오버로딩의 개념을 학습한다.
 */
fun main(args: Array<String>) {

    //Ctrl 을 누른 채로 소스코드의 println을 누르면 println 함수가 선언된 파일 Console.kt로 이동할 수 있다.
    println()

    //@kotlin.internal.InlineOnly -> 어노테이션

    //아래와 같이 매개변수의 타입만 다르지 함수의 이름은 모두 println이다. -> println은 거의 모든 타입에 대해 오버로딩이 되어 있다. 이러한 기법 때문에 println에 무엇을 넘기더라도 정상 동작하는 것.
    //코틀린에서는 함수 시그니처가 다르기만 하면 함수 이름의 중복을 허용한다.
    //이렇게 이름이 같은 함수를 여러 개 선언하는 것을 함수 오버로딩이라고 한다.
    //시그니처란 -> 함수의 고유한 특징은 나타내는 것으로, 매개변수의 개수와 타입, 반환 타입에 대한 정보를 뜻한다.

    /**
    - Console.kt 의 일부

    /** Prints the given [message] to the standard output stream. */
    @kotlin.internal.InlineOnly
    public inline fun print(message: Int) {
    System.out.print(message)
    }

    /** Prints the given [message] to the standard output stream. */
    @kotlin.internal.InlineOnly
    public inline fun print(message: Long) {
    System.out.print(message)
    }

    /** Prints the given [message] to the standard output stream. */
    @kotlin.internal.InlineOnly
    public inline fun print(message: Byte) {
    System.out.print(message)
    }
     */

}
