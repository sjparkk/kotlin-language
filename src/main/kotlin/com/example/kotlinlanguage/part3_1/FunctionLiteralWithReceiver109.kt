package com.example.kotlinlanguage.part3_1

/**
 * 리시버가 붙은 함수 리터럴
 *
 * 리시버가 적용된 함수 리터럴을 만드는 방법을 알아본다.
 */

//함수 리터럴에 리시버를 적용하여 확장 함수처럼 만들 수 있다.
fun main(args: Array<String>) {

    //Int 리시버를 [left, right] 범위 이내로 가공하여 반환하는 확장 함수
    //Int.(left: Int, right: Int) -> Int은 리시버 타입이 Int이고, 매개변수 타입이 (Int, Int)이며, 반환 타입이 Int 인 함수 타입
    val makeSure: Int.(left: Int, right: Int) -> Int

    //리시버가 적용된 함수 리터럴을 만들고 있다. 람다식으로 함수 리터럴을 작성할 때는 기존과 동일하게 적으면 된다.
    //익명 함수 형태로 함수 리터럴을 작성하고 싶다면 fun Int.(left: Int, right: Int): Int { ... } 로 적으면 된다.
    makeSure = { left: Int, right: Int ->
        //리시버가 붙은 함수 리터럴에는 리시버를 나타내는 this 키워드를 사용할 수 있다.
        if (this < left) left
        else if (this > right) right
        else this
    }

    //리시버가 적용된 함수 타입의 변수는 리시버.변수(인수)의 형태로 호출 가능
    println(15.makeSure(20, 40))
    println(18.makeSure(0, 50))
    println(24.makeSure(0, 19))
}