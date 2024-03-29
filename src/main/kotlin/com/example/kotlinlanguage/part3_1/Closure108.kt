package com.example.kotlinlanguage.part3_1

/**
 * 클로저
 *
 * 선언될 당시의 상황을 기억하는 함수인 클로저에 대해 알아본다.
 */

//지역 변수에 경우에는 항상 자신이 소속된 블록이 끝나면 소멸한다.
//그러나, 클로저라는 것을 이용하여 지역 변수가 소멸하지 않는 것처럼 보이도록 할 수 있다.

//() -> Unit 타입의 함수를 반환하는 returnFunc 함수를 선언하고 있다.
fun returnFunc(num: Int): () -> Unit = { println(num) }

fun main(args: Array<String>) {

    //참조 변수 f에 returnFunc 함수가 반환한 함수를 저장하고 있다.
    val f: () -> Unit = returnFunc(30)

    //f 가 가리키는 함수를 호출하고 있다. 30이 출력된다.
    f()

    //f를 호출하면 println(num)이 수행될 것이다. 하지만 f 가 호출되는 시점에는 num 매개변수가 이미 사라지고 없지만
    //함수 리터럴이 만들어지는 순간, 함수 리터럴은 자기 주변의 상황을 함께 저장한다.

    //즉, 함수가 만들어질 때 num 매개변수의 값을 복사해 갖고 있는다. -> 이렇게 함수가 만들어질 때 주변 상황을 기억하는 함수를 '클로저'라고 부른다.
}