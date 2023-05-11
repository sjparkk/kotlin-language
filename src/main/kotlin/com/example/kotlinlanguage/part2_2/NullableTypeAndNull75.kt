package com.example.kotlinlanguage.part2_2

import com.example.kotlinlanguage.part2_1.Person

/**
 * Nullable 타입과 null
 *
 * 참조 변수가 가리키는 객체가 없음을 나타내는 null의 개념에 대해 알아본다.
 *
 * 타입 이름 뒤에 ?를 붙이면 변수를 Nullable하게 만들 수 있다.
 * Nullable이란, null 값을 지정할 수 있는 변수를 뜻하며 null은 참조 변수가 어떠한 객체도 가리키지 않고 있음을 나타내는 키워드이다.
 */

fun main(args: Array<String>) {

    //Person? 타입의 참조 변수에 Person의 인스턴스를 대입하고 있다.
    var person: Person? = Person("K", 30)
    //person 참조 변수에 null을 지정하고 있다. null은 Nothing? 타입의 표현식이며, Nothing은 어떠한 타입과도 호환되므로, null을 Person? 타입에 대입할 수 있는 것!
    person = null

    //Byte, Short, Int, Long, Float, Double, Char, Boolean 타입 뒤에 ?를 붙이면 그 변수는 참조 변수가 된다.
    //즉, 실제 데이터가 스택 영역이 아닌 힙 영역에 생성된다.
    var num: Int? = null

    //num은 Nullable 타입이므로, 스택이 아닌 힙에 실제 데이터가 저장된다.
    num = 10

    /**
     * 자바는 모든 참조 타입에 기본적으로 null을 지정할 수 있지만 코틀린에서는 Nullable 타입이 아니면 null을 지정하지 못한다.
     */
    //다음과 같이 한쪽 블록에 null을 지정하면 어떤 타입으로 인식될까? -> 정답은, String? 타입 (null은 Nothing? 타입이므로 String과 ? 이 합쳐짐)
    if(true) "Test" else null
}