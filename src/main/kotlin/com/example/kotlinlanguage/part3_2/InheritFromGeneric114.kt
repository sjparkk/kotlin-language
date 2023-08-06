package com.example.kotlinlanguage.part3_2

/**
 * 제네릭이 적용된 클래스/인터페이스 상속 구현하기
 *
 * 제네릭이 적용된 클래스나 인터페이스를 상속 구현하는 방법을 알아본다.
 */
//제네릭이 적용된 클래스나 인터페이스는 상속할 때 타입 인수를 전달해 주어야 한다.
interface Plusable<T> {
    operator fun plus(other: T): T
}

//T 타입과 덧셈을 가능하게 하는 인터페이스를 선언
class Rectangle(val width: Int, val height: Int): Plusable<Rectangle> {

    //Plusable에는 제네릭이 적용되어 있어 타입인수를 전달해야 한다. 여기서는 Rectangle 타입을 전달
    override fun plus(other: Rectangle): Rectangle =
        Rectangle(width + other.width, height + other.height)

    override fun toString(): String {
        return "width: $width, height: $height"
    }
}

fun main(args: Array<String>) {

    val rect = Rectangle(10, 5)
    val rect2 = Rectangle(3, 8)

    println(rect + rect2)
}