package com.example.kotlinlanguage.part3_1

/**
 * 다이아몬드 문제 (상속 관계의 그림이 다이아몬드를 닮아서 다이아몬드 문제라는 이름이 붙음)
 *
 * 인터페이스를 여러 개 상속할 때 발생할 수 있는 문제를 이해한다.
 */

interface Parent { fun follow(): Unit }

//인터페이스 간에는 구현이 아닌 상속이라는 표현을 쓴다. -> Mother 인터페이스는 Parent 인터페이스를 상속
interface Mother: Parent {
    override fun follow() {
        println("follow his mother")
    }
}

interface Father: Parent {
    override fun follow() {
        println("follow his father")
    }
}

class Child: Mother, Father {
    override fun follow() {
        println("A child decided to")

        //Many supertypes available, please specify the one you mean in angle brackets, e.g. 'super<Foo>'
        //Child 클래스는 Mother, Father 인터페이스를 모두 구현하고 있어 super.hello()를 하면 어떤 인터페이스의 follow가 호출될지 애매하다.
//        super.follow()

        //코틀린은 이런 상황을 위해 원하는 인터페이스의 super를 호출할 수 있는 기능을 제공한다.
        super<Mother>.follow()
        super<Father>.follow()
    }
}

fun main(args: Array<String>) {
    Child().follow()
}