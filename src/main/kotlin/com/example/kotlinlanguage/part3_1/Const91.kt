package com.example.kotlinlanguage.part3_1

/**
 * const
 *
 * 변수에 접근하는 코드를 변수에 저장된 값으로 대체시키는 const에 대해 알아본다.
 */

//inline함수와 비슷하게, val 변수 앞에 const 키워드를 붙이면 변수에 접근하는 코드를 변수에 저장된 값으로 대체시킨다.

//전역 변수 hello에 const 키워드를 붙였다. const 키워드는 전역 변수, 오브젝트의 프로퍼티 등에 붙일 수 있다.
//프로그램 어디서나 바로 접근할 수 있는 변수에 붙일 수 있다고 생각하면 된다.
//const가 붙은 변수에는 리터럴로 이루어진 표현식만 저장이 가능하다.
const val hello = "Hello" + "World!"

//오브젝트의 bar 프로퍼티에 const 키워드를 붙였다. 리터럴로 이루어진 표현식 저장
object Foo {
    const val bar = "bar"
}

fun main(args: Array<String>) {

    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)

    //해당 문장들은 실제로 컴파일 되면 다음과 같이 대체
    println("Hello World!")
    println("bar")
    println("Hello World!")
    println("bar")

    /**
     * const 키워드 활용
     *
     * const 키워드는 어디에 활용할 수 있을까?
     * 코틀린 문법 중에는 리터럴만 와야 하는 자리가 몇 군데 있다. const 키워드가 붙은 변수는 리터럴로 대체되므로 이런 곳에 사용하면 좋다. (뒤쪽에 나옴.)
     */
}