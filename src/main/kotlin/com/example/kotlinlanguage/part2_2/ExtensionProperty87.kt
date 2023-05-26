package com.example.kotlinlanguage.part2_2

/**
 * 확장 프로퍼티
 *
 * 클래스 밖에서 프로퍼티를 선언하는 방법에 대해 알아본다.
 */
//확장 프로퍼티도 확장 함수처럼 프로퍼티 이름 앞에 리시버 타입을 적는다.
val String.isLarge: Boolean
    //문자열의 길이가 10 이상이면 큰 것으로 간주
    get() = this.length >= 10

fun main(args: Array<String>) {
    //isLarge는 프로퍼티이기 때문에 소괄호는 사용 x
    println("1234567890".isLarge)
    println("500d원".isLarge)

    /**
     * 확장 프로퍼티에는 Field가 존재하지 않는다. 따라서 field 식별자는 사용할 수 없다.
     */
}