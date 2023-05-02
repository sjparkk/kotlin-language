package com.example.kotlinlanguage.part2_1

/**
 * 다형성의 활용
 *
 * 멤버 함수를 호출할 때, 참조 변수가 실제로 가리키고 있는 객체의 멤버 함수가 호출된다는 것을 배운다.
 * 오버라이딩을 통해 다형성을 활용하는 방법을 알아본다.
 */
open class CCCC {
    open fun hello() = println("CCC 입니다.")
}

class DDD: CCCC() {
    override fun hello() = println("DDD 입니다.")
}

fun main(args: Array<String>) {

    // onr, two 참조변수에 각각 인스턴스를 저장
    val one = CCCC()
    val two = DDD()

    // three에는 two에 저장된 DDD 인스턴스를 저장
    val three: CCCC = two

    one.hello()
    two.hello()

    //three 의 타입은 CCCC이지만 DDD클래스의 hello 멤버 함수가 호출되었다.
    //여기서 볼 수 있듯이, 오버라이딩 된 멤버 함수를 호출하면 참조 변수가 실제로 가리키고 있는 객체의 멤버 함수가 호출된다.
    three.hello()
}