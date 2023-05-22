package com.example.kotlinlanguage.part2_2

/**
 * 접근지정자: protected
 *
 * protected 접근 지정자는 클래스 내부에서 사용된다.
 */
//상속 가능하도록 open 키워드 & number 프로퍼티에 protected 선언을 통해 서브클래스인 BBB 안에서 접근 가능
open class AAA(protected val number: Int)

class BBB(number: Int): AAA(number) {

    fun printNumber() {
        //AAA클래스의 number 프로퍼티에 접근 가능
        println(number)
    }
}

fun main(args: Array<String>) {

    val test = BBB(36)

    //println(test.number) 에러 -> number 프로퍼티는 AAA, BBB 클래스 외부에서 접근이 불가능하므로 error 발생
    test.printNumber()
}