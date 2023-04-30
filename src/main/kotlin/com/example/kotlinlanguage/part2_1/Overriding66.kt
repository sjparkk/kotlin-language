package com.example.kotlinlanguage.part2_1

/**
 * 오버라이딩
 *
 * 슈퍼클래스의 멤버 함수를 서브클래스에서 덮어쓰기하는 방법에 대해 배운다.
 *
 * 슈퍼클래스의 멤버 함수와 시그니처가 동일한 멤버 함수를 서브클래스에서 선언하면, 슈퍼클래스 멤버 함수의 동작을 덮어쓰기 할 수 있다. 이것이 오버라이딩이라고 한다
 */
open class AAAA {
    open fun func() = println("AAAA")

    open fun finalFunc() = Unit
}

open class BBB: AAAA() {

    //오버라이딩 사용을 위해 override 키워드를 붙여야 함
    //자바에서는 오버라이딩 시 @Override 어노테이션이 옵션이지만 코틀린에서는 override 키워드는 반드시 붙여야 한다.
    override fun func() {

        //this는 클래스 자기 자신의 이름을 나타내는 대명사였다면, super는 슈퍼클래스의 이름을 나타내는 대명사이다.
        super.func()
        println("BBB")
    }

    final override fun finalFunc() {
        super.finalFunc()
    }
}

class CCC: BBB() {

    /**
     * 추가적으로 override 앞에 final 키워드를 붙이면 더 이상 해당 함수를 오버라이딩할 수 없게 만들수 있다.
     */
    //'finalFunc' in 'BBB' is final and cannot be overridden
//    override fun finalFunc() {
//        super.finalFunc()
//    }
}

fun main(args: Array<String>) {

    AAAA().func()
    BBB().func()
}