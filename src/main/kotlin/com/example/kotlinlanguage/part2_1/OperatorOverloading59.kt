package com.example.kotlinlanguage.part2_1

/**
 * 연산자 오버로딩
 *
 * 사용자 정의 클래스에서 연산자를 사용할 수 있게 하는 방법을 배운다.
 */
//다음과 같이 2차원 평면의 좌표를 표현하는 클래스가 있다고 가정하자.
class Point(var x: Int = 0, var y: Int = 0) {

}

//하지만 연산자 오버로딩을 이용하면 pt1+pt2가 가능하게 할 수 있다.
class Point1(var x: Int = 0, var y: Int = 0) {

    //operator 의 의미는 Point1 인스턴스 간에 연산자를 사용했을 때 이 멤버 함수를 대신 호출해달라는 뜻이다.
    //plus 함수 명은 + 연산자를 오버로딩 한다. 즉, pt1 + pt2를 하면 실제로는 pt1.plus(pt2)을 수행한다.
    operator fun plus(other: Point1): Point1 {
        return Point1(x + other.x, y + other.y)
    }

    operator fun minus(other: Point1): Point1 {
        return Point1(x - other.x, y - other.y)
    }

    operator fun times(number: Int): Point1 {
        return Point1(x * number, y * number)
    }

    operator fun div(number: Int): Point1 {
        return Point1(x / number, y / number)
    }
}

fun main(args: Array<String>) {

    //이 클래스의 두 객체끼리 덧셈을 하려고 한다. 다음과 같은 코드가 가능할까?
    val pt1 = Point(3, 7)
    val pt2 = Point(2, -6)
    //결과는 불가능하다. Point 타입은 숫자 타입이 아니어서 더하기 연산자를 사용할 수 없기 때문! -> Unresolved reference. None of the following candidates is applicable because of receiver type mismatch
    /*val pt3 = pt1 + pt2*/ // pt의 x에는 5가, y에는 1이 저장되기를 원함

}

/**
 표현식 함수이름
 a+b plus
 a-b minus
 a*b times
 a/b div
 a%b rem
 a+=b plusAssign
 a-=b minusAssign
 a*=b timesAssign
 a/=b divAssign
 a%=b remAssign
 a>b compareTo
 a<b compareTo
 a>=b compareTo
 a<=b compareTo
 a==b equals
 a!=b equals
 */