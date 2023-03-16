package com.example.kotlinlanguage.part1_2

import com.sun.source.tree.UnionTypeTree

/**
 * 반환 값을 가지지 않는 함수에 대해 알아본다.
 *
 * 함수를 작정하다 보면 가끔 반환 값이 필요하지 않은 경우가 있다.
 */
fun main(args: Array<String>) {

    celsiusToFah(27)

}

//이전 예제의 cToF 함수와 이름이 겹치지 않도록 함수의 이름을 변경
fun celsiusToFah(celsius: Int): Unit {
    println(celsius * 1.8 + 32)
}

//위와 같이 명시적으로 Unit을 정의해도 되지만 return을 생략하면 자동으로 Unit이 된다.
//코틀린의 Unit은 자바의 void의 대응되는 개념이지만 완전히 같은 것은 아니다.
//void는 반환값이 없음을 의미하는 특수 타입이지만 Unit은 class 키워드로 정의된 일반 타입이기 때문이다. (자바의 Void와 비슷한 개념이라고 생각하면 된다.)
//Unit객체는 싱글톤 인스턴스이기 때문에 매번 객체를 생성하지는 않는다.