package com.example.kotlinlanguage.part3_2

import kotlin.reflect.KProperty

/**
 * 위임된 프로퍼티
 *
 * 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡기는 방법을 알아본다.
 */

/**
 * 프로그램을 작성하다 보면 Int 타입의 프로퍼티에 음수가 저장되는 것을 방지하는 Setter를 정의할 때가 자주 있다.
 *
 * var age: Int set(value) if(value >= 0) field = value
 * var salary: Int set(value) if(value >= 0) filed = value
 *
 * 그러나 이렇게 모든 프로퍼티의 Setter를 일일이 정의하는 것은 너무 번거롭다.
 *
 * 코틀린에서는 이런 상황을 위해 프로퍼티의 Getter/Setter 구현을 다른 객체에 맡길 수 있는 문법을 제공한다.
 */
class Sample {
    //프로퍼티 선언문 뒤에 by 객체를 적으면 해당 객체가 프로퍼티의 Getter/Setter를 대리하게 된다.
    var number: Int by OnlyPositive()
}

class OnlyPositive {

    private var realValue: Int = 0

    //프로퍼티를 대리하는 객체는 아래 두 멤버함수를 갖고 있어야 한다. 여기서 T는 대리할 프로퍼티의 타입이다(해당 예제는 Int)
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return realValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        realValue = if(value > 0) value else 0
    }

    //Sample 클래스의 number 프로퍼티의 Getter는 OnlyPositive의 getValue로 대체되고 Setter는 setValue로 대체된다.
}

fun main(args: Array<String>) {

    val sample = Sample()

    //실행되는 순간 OnlyPositive의 setValue가 호출
    sample.number = -50
    println(sample.number)

    sample.number = 100
    println(sample.number)
}

