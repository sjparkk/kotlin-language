package com.example.kotlinlanguage.part3_1

/**
 * 인터페이스
 *
 * 어떤 클래스에 특정 멤버 함수나 프로퍼티가 존재한다는 것을 보장하기 위한 개념인 인터페이스에 대해 알아본다.
 */

//인터페이스는 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치이다.
//인터페이스는 멤버 함수, 추상 멤버 함수, 추상프포퍼티를 가질 수 있다. -> 일반 프로퍼티와 생성자는 가질 수 없다.
//코틀린의 인터페이스는 Java 8의 인터페이스처럼 멤버 함수가 기본 구현을 가질 수 있다.
interface Printable {
    fun print(): Unit
}

//인터페이스에는 생성자가 존재하지 않기 때문에 상속할 때 이름 옆에 ()를 쓰지 않는다.
//또한 인터페이스는 한 번에 하나씩만 상속이 가능한 클래스와는 다르게 여러개를 구현할 수 있다.
class AAA1: Printable {

    //print()를 반드시 오버라이딩 해야 한다.
    override fun print() {
        println("Hello")
    }
}

fun print(anything: Printable) {
    anything.print()
}

fun main(args: Array<String>) {
    println(AAA1())
}

/**
 * 인터페이스는 어디에 쓰는 것이 좋을까?
 *
 * 일단 인터페이스는 기존의 클래스를 확장한다는 것보다는, 어떤 클래스에 플러그인을 추가한다는 개념에 가깝다!
 * ex) AAA1 클래스가 Printable 인터페이스를 구현한다는 것은 AAA1에 출력 기능을 갖는 Printable 플러그인을 탑재시키는 것이라고 생각하면 된다.
 *
 * AAA1클래스에 코틀린 내장 인터페이스인 Comparable을 구현하도록 하면 AAA1 클래스는 출력 기능과, 비교 기능을 갖게 된다.
 */