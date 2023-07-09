package com.example.kotlinlanguage.part3_1

/**
 * 함수 리터럴과 람다식
 *
 * 선언 없이 함수를 즉석으로 만들어 내는 방법을 배운다.
 * fun 키워드를 이용하여 함수를 선언하였지만 코틀린은 함수를 만드는 더 간단한 방법을 제공한다.
 */
fun main(args: Array<String>) {

    //(Int) -> Unit은 변수의 타입이다. (Int) -> Unit은 매개변수가 Int 타입이고 반환 타입이 Unit 인 함수를 저장할 수 있는 타입이다.
    //이처럼 함수를 저장할 수 있는 타입을 함수 타입이라고 한다.
    val instantFunc: (Int) -> Unit

    //이 부분은 함수 리터럴이다. 함수 리터럴이란 말 그대로 함수를 나타내는 리터럴이라는 뜻
    //number: Int 부분은 함수 리터럴의 매개변수를 나타내며 -> 를 경계로 매개변수와 함수의 내용이 분리된다. 만약 매개변수가 없는 함수 리터럴을 만들고 싶다면 number: Int -> 부분 없이 함수의 내용만 나오면 된다.
    //추가적으로 함수 리터럴에는 return을 적지 않는다.
    instantFunc = { number: Int ->
        println("Hello $number")
    }

    instantFunc(33)
    //함수 타입의 변수는 invoke 멤버 함수를 통해서도 호출할 수 있다. 일반적으로는 ()로 바로 호출하면 되지만 변수가 Nullable일 때는 invoke를 통해서 호출하는 편이 Null 처리를 하기 편해진다.
    instantFunc.invoke(33)

    //코틀린에서는 함수 리터럴을 두 가지 형태로 만들 수 있으며, { 매개변수 -> 반환 값} 형태가 그 중 하나이다. 그리고 이것을 람다식이라고 부른다.
}