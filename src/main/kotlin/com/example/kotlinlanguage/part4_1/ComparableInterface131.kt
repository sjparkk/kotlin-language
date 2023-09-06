package com.example.kotlinlanguage.part4_1

/**
 * Comparable 인터페이스: 클래스를 비교 가능하게 만들기
 *
 * Comparable 인터페이스를 이용하여 클래스에 인스턴스간 비교 기능을 추가해보자.
 */

//Comparable 인터페이스는 다음과 같이 선언되어 있다.
//타입 매개변수 T를 받으며, 연산자 멤버 함수로 compareTo를 가지고 있다. 즉, Comparable인터페이스를 구현하는 클래스는 비교 연산자(<, >, <=, >=)를 지원하게 된다.
//interface Comparable<in T> {
//    operator fun compareTo(other: T): Int
//}


class Rectangle(val width: Int, val height: Int): Comparable<Rectangle> {

    val area = width * height

    //사각형의 넓이로 인스턴스의 대소를 비교하도록 compareTo를 오버라이딩하고 있다.
    override fun compareTo(other: Rectangle): Int {
        return when {
            this.area > other.area -> 1
            this.area < other.area -> -1
            else -> 0
        }
    }
}


fun main(args: Array<String>) {

    val rect = Rectangle(3, 5)
    val rect2 = Rectangle(7, 3)
    val rect3 = Rectangle(2, 9)

    //Rectangle의 인스턴스들끼리 대소를 비교하고 있다.
    println(rect >= rect3)
    println(rect < rect2)
    println(rect2 > rect3)
}
