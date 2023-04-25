package com.example.kotlinlanguage.part2_1

/**
 * 멤버 함수의 중위 표기법
 *
 * 함수를 연산자처럼 호출하는 방법에 대해 알아본다.
 * 중위 표기법(Infix Notation)이란, 피연산자 연산자 피연산자의 순서로 표현식을 구성하는 방식을 뜻한다.
 */

class Point2(var x: Int = 0, var y: Int = 0) {

    //base를 원점으로 생각했을 때의 좌표를 반환한다.
    //중위 표기법을 지원하려면 멤버 함수 선언문 앞에 infix를 붙어야 한다.
    infix fun from(base: Point2): Point2 {
        return Point2(x - base.x, y - base.y)
    }
}

fun main(args: Array<String>) {
    //중위 표기법을 안 쓴다면 다음과 같이 Point2(3,6).from(Point2(1,1))로 사용 해야 된다.
    //중위 표기법을 사용함으로써 점과 소괄호 한쌍이 줄어 들어 더 읽기 편해졌다.
    val pt = Point2(3,6) from Point2(1,1)
    println(pt.x)
    println(pt.y)
}