package com.example.kotlinlanguage.part3_2

/**
 * 특정 타입을 상속 구현하는 타입만 인수로 받기
 *
 * 타입 매개변수로 특정 타입을 상속 구현하는 타입만 받는 방법을 알아본다.
 */
//제네릭을 사용하다보면 특정 타입에만 선언되어 있는 프로퍼티나 멤버 함수에 접근하기 위해 특정 타입만 인수로 받아야할떄가 있다.
interface ValueContainer {
    //getValue라는 멤버함수를 갖는 인터페이스를 선언
    fun getValue(): Int
}

class AAA: ValueContainer {
    override fun getValue(): Int {
        return 1102
    }
}

class BBB: ValueContainer {
    override fun getValue(): Int {
        return 127
    }
}

//특정 타입을 구현하는 타입만 인수로 받으려면 상속을 할 때 처럼 타입 매개변수 뒤에 : 타입 이름을 적어준다.
fun <T: ValueContainer> T.printValue() {
    //T타입은 ValueContainer 인터페이스를 구현하므로 getValue멤버 함수를 호출할 수 있다.
    println(this.getValue())
}

fun main(args: Array<String>) {
    AAA().printValue()
    BBB().printValue()
}