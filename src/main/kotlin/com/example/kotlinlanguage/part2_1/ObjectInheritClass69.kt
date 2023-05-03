package com.example.kotlinlanguage.part2_1

/**
 * 클래스를 상속하는 객체
 *
 * 클래스 없이 특정 클래스를 상속하는 객체를 만드는 법을 배운다.
 */
open class Person5(val name: String, val age: Int) {

    open fun print() {
        println("이름 : $name")
        println("나이 : $age")
    }

}

fun main(args: Array<String>) {

    //클래스 없이 객체를 만들 때 쓰는 object 표현식으로도 상속을 할 수 있다.
    //Person5 클래스를 상속하는 object 표현식이다.
    //클래스 없이 객체를 만들면서 상속을 했으므로 이때의 상속은 '1회용'이 된다.
    val custom: Person5 = object : Person5("Alan", 23)
    {
        override fun print() {
            println("It's a object")
        }
    }

    //실제 custom 참조 변수가 가리키고 있는 객체의 print 멤버 함수가 호출 It's a object 출력
    custom.print()
}