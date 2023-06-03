package com.example.kotlinlanguage.part3_1

/**
 * lateinit
 *
 * 프로퍼티의 초기화를 유예하는 방법에 대해 알아본다.
 */
class Lateinit92 {

    //클래스의 프로퍼티는 선언과 동시에 초기화하거나 init 블록 안에서 반드시 초기화 해주어야한다.
    //그러나 이런 강제성은 너무 불편해 프로퍼티의 타입이 String이나 Int라면 ""이나 0 등으로 초기화하면 되지만, 만약 사용자 정의 클래스라면 어떻게 초기화할 것인가?
}

class Point(val x: Int, val y: Int)

class Rect {
    //lateinit 키워드를 붙이면 해당 프로퍼티는 클래스 안에서 바로 초기화 하지 않아도 된다.
    lateinit var pt: Point
    // var 에만 붙일 수 있다. val x
    lateinit var pt2: Point

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main(args: Array<String>) {

    val rect = Rect()
    rect.pt = Point(3,3)
    rect.pt2 = Point(6,5)

    //pt와 pt2 프로퍼티에 값을 지정하지 않을 채 프로퍼티에 접근하면 UninitializedPropertyAccessException 발생
    println("너비:${rect.width}")
    println("높이:${rect.height}")
    println("넓이:${rect.area}")
}