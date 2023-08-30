package com.example.kotlinlanguage.part3_2

/**
 * 열거 클래스 활용하기
 *
 * 열거 클래스에 기본적으로 정의되는 멤버 함수와 프로퍼티에 대해 배운다.
 *
 * 모든 열거 클래스는 자동으로 Enum이라는 클래스를 상속한다.
 *
 * val name: String
 * val ordinal: Int
 * fun valueOf(value: String): 열거 클래스
 * fun values(): Array<열거 클래스>
 */
enum class Mode3 {
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>) {

    val shapeMode: Mode3 = Mode3.SHAPE

    //각 열거 상수에 존재하는 name 프로퍼티는 열거 상수의 이름을 의미
    println(shapeMode.name) //SHAPE
    //열거 상수의 순서를 의미
    println(shapeMode.ordinal) //2 (순서는 0부터 시작하기 때문에 3번째에 있지만 2 출력)

    //모든 열거 상수들을 배열로 반환
    val modes: Array<Mode3> = Mode3.values()
    for (mode: Mode3 in modes) {
        println(mode)
    }

    println(Mode3.valueOf("PEN").ordinal)
}