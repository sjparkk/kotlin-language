package com.example.kotlinlanguage.part2_1

/**
 * 프로퍼티와 멤버 함수의 매개변수 이름이 중복될 때
 *
 * 프포퍼티와 멤버 함수의 매개변수의 이름이 같을 때, 이 둘을 어떻게 구분하는지 알아본다.
 */
class AAA {

    //AAA class 안에 num 이라는 프로퍼티가 있다
    var num = 15

    //멤버 함수 안에도 매개변수 이름이 num으로 존재한다.
    fun memberFunc(num: Int) {

        println(num)
        //변수 앞에 this.를 붙이면 이 변수는 프로퍼티로 인식된다.
        //프로퍼티와 동일한 이름의 매개변수가 없으면 this가 생략 가능하지만 동일한 이름이 있으므로 반드시 작성해야된다.
        println(this.num)
    }
}

fun main(args: Array<String>) {

    val a = AAA()
    a.memberFunc(53)
}