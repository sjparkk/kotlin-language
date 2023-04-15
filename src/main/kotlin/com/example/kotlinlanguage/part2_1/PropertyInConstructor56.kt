package com.example.kotlinlanguage.part2_1

/**
 * 생성자와 프로퍼티 한번에 쓰기
 *
 * 프로퍼티 선언과 생성자 정의를 한번에 하는 방법을 알아본다.
 * 프로퍼티 선언문과 생성자 정의문을 보면 비슷한 코드가 반복되는 것을 알 수 있다.
 * 간결함을 중시하는 코틀린에서는 이러한 중복 코드를 좋아하지 않기 때문에 생성자와 프로퍼티를 한번에 쓸 수 있는 문법을 제공한다.
 */

//생성자 매개변수 앞에 val or var 키워드를 붙이면, 동일한 이름의 프로퍼티가 같이 선언된다.
//그리고 생성자 매개변수에 들어온 인수가 프로퍼티의 초기값이 된다.
//speed의 경우에는 디폴트 인수를 지정
//class 안에 들어가는 내용이 하나도 없다면 중괄호 생략 가능
class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>) {

    val car = Car("My Car")
    println(car.name)
    println(car.speed)
}