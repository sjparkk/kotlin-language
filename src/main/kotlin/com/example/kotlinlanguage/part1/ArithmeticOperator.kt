package com.example.kotlinlanguage.part1

/**
 * Arithmetic operator
 * 가감승제를 수행하는 연산자를 배움.
 */
fun main(args: Array<String>) {

    //사칙연산의 법칙을 따르기 때문에 곱하기 먼저 수행
    val num: Int = 15 - 4 * 3

    //Int 외 Int 의 연산이므로 Int가 나옴
    // % 연산자는 나머지를 의미하며 나눗셈의 일종으로 취급되기 때문에 + , - 보다 우선순위 높음
    val num2: Int = 65 % 7

    //double 타입은 실수 (소수점이 있는 수) 값을 저장할 수 있는 타입
    // 만약 Int 타입과 Double 타입을 + 연산하게 되면 Double 타입이 결과로 나오게 됨 (이유는 Int 타입으로 계산되면 소수점이 손실될 수 있기 때문)
    val num3: Double = 7.5 / 5 + 22.25

    //num 과 num2에는 각각 3과 2가 저장되어 3/2 연산 시 1.5가 나와야 하지만 각각이 Int형이므로 .5가 잘려나가 1만 남게된다. (Int 타입끼리의 산술 연산을 하면 무조건 Int만 나오기 때문)
    val num4: Double = num / num2 + 0.7

    println(num)
    println(num2)
    println(num3)
    println(num4)

    //위에서 본 것과 같이 계산 결과가 다르게 나오는 경우를 방지하기 위해 변수의 타입을 정확히 선언하는 것이 좋다.
    //다음과 같이 선언하면 Type mismatch. 에러가 발생한다.
    //코틀린은 자바보다 더 타입 체크에 엄격하다. -> 15.0 - 4 * 3 으로 수정하면 된다.
    //val num5: Double = 15 - 4 * 3

    //코틀린에서 Int 타입을 Double 타입으로 변환할때 캐스팅이 아닌 toDouble()를 사용하는 이유는 Int와 Double가 서로 상속 관계가 아니기 때문에 캐스팅으로 형변환이 불가능하다.

}
