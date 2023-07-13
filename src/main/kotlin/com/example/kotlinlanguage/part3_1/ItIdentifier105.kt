package com.example.kotlinlanguage.part3_1

/**
 * it 식별자
 *
 * 매개변수가 하나인 함수 리터럴의 매개변수를 생략할 수 있음을 이해한다.
 */

fun main(args: Array<String>) {

    //(Int) -> Unit 타입에 맞는 함수 리터럴을 작성하려면 Int 타입의 매개변수를 적어주어야 하지만 생략
    val instantFunc: (Int) -> Unit = {
        //생략을 하면 it 이라는 특별한 식별자가 만들어진다.
        //여기서 it이 우리가 생략한 Int 타입의 매개변수를 대채하여 출력되게 된다.
        println("Hello $it")
    }

    instantFunc(33)
}