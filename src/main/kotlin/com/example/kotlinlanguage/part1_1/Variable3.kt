package com.example.kotlinlanguage.part1_1

fun main(args: Array<String>): Unit {

    //표현식을 계산하고 나온 결과 값은 다음 줄을 실행하는 순간 소멸 됨
    //그러므로 계속 결과 값을 유지하고 싶다면 어디엔가 보관해 두어야 하는데 프로그래밍 언어에서는 이를 위해 '변수(Variable)' 이라는 개념을 갖고 있음
    //즉, 변수는 값을 저장해놓은 공간 정도로 이해하면 됨

    //var 은 바로 뒤에 오는 total 이 변수임을 나타내는 키워드
    //total 은 변수의 이름을 나타냄
    //total 처럼 우리가 임의로 지어낸 이름을 '식별자(Identifier)' 라고 함
    //식별자는 키워드를 제외한 영문자, 숫자, _ 로만 지을 수 있으며, 숫자는 맨 앞에 오면 안됨 (코틀린에서는 자바와 달리 식별자에 $ 사용 불가능)
    var total: Int
    total = 0

    // 위와 달리 선언과 동시에 초기화
    var total1: Int = 0

    //코틀린에서는 자바와 달리 원시(Primitive) 타입이 없다
    //즉 코틀린에서는 Int와 같은 기본 타입들도 모두 클래스이다. -> 자바의 래퍼 클래스가 코틀린에서는 기본 타입이 되었다고 생각하면 됨.
    val a:Int = 10 + 53 - 7
    println(a)

    //val 도 var과 같이 바로 뒤에 나올 식별자가 변수임을 나타내는 키워드이며 var과 다른 점은 val로 선언된 변수는 한번 값을 저장하면 나중에 값을 수정할 수 없다는 점.
    //var 은 일반 변수, val은 final 변수로 생각, 불변 변수 (Immutable Variable)의 사용을 장려하기 위함.
    val b:Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)

    /**
     * Variable 'init' must be initialized
     * 아래와 같이 사용하면 초기화 오류 발생
     * 이렇듯이 변수 사용시 반드시 초기화를 해야한다. 초기화를 하지 않으면 그 변수에 어떤 값이 들어있는지 확인이 불가능하기 때문
     */
    var init: Int
    //println(init + 15)

    //마지막으로 변수는 '메모리(RAM)'라는 공간에 생성됨 (Int 타입 변수 하나 선언 시 4바이트 차지)

}