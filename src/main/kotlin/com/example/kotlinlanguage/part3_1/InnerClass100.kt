package com.example.kotlinlanguage.part3_1

/**
 * 내부 클래스(Inner Class)
 *
 * 인스턴스에 소속되는 클래스에 대해 알아본다/
 */
//value 프로퍼티와 print 멤버 함수를 갖는 Outer 클래스
class Outer(private val value: Int) {

    fun print() {
        println(this.value)
    }

    //innerValue 프로퍼티와 print 멤버 함수를 갖는 Inner 내부 클래스를 선언
    //내부 클래스 선언 시 선언문 앞에 inner 키워드 붙임
    inner class Inner(private val innerValue: Int) {
        fun print() {
            this@Outer.print()
            println(this.innerValue + this@Outer.value)
        }
    }
}

fun main(args: Array<String>) {

    //Outer의 인스턴스를 생성
    val instance: Outer = Outer(610)

    //Outer.Inner의 인스턴스 생성 -> 내부 클래스의 인스턴스를 생성하려면 클래스이름.생성자()가 아닌, 참조변수.생성자()를 해야한다.
    //내부 클래스는 바깥 클래스의 인스턴스로부터만 생성할 수 있기 때문이다.-
    val innerInstance: Outer.Inner = instance.Inner(40)
    innerInstance.print()
}