package com.example.kotlinlanguage.part2_2

/**
 * 접근 지정자
 *
 * 함수, 전역변수, 클래스, 프로퍼티, 멤버 함수 등에 접근 권한을 지정하는 법을 알아본다.
 */
class AccessModifier82 {

    //코틀린에서 선언 가능한 요소 중, 일부 요소에 접근 권한이라는 것을 지정할 수 있다.
    //이를 접근 지정자 또는 가시성 지정자라고 한다. 접근 지정자는 총 4개가 있다.

    //1. public - 모든 곳에서 접근 가능, 접근 지정자 생략 시 기본적으로 public
    //2. internal - 같은 모듈 안에서 접근 가능. 여기서 모듈은 프로젝트의 모듈을 가리킴
    //3. protected - 클래스 내부와, 서브클래스 안에서만 접근 가능
    //4. private - 프로퍼티와 멤버 함수일 경우 해당 클래스 안에서만 접근 가능하고, 그 외의 경우에는 같은 파일 내에서만 접근 가능

    class Rectangle(private val width: Int, private val height: Int) {
        val area: Int
            get() = width * height
    }

    fun main(args: Array<String>) {
        val rect = Rectangle(5, 7)

        //Cannot access 'width': it is private in 'Rectangle'
//        println(rect.width)

        //area 프로퍼티는 public이기 때문에 접근해도 문제 없다.
        println(rect.area)

        /**
        다음과 같은 곳에 접근 지정자를 붙일 수 있다.

         접근 지정자 CLass 식별자 접근 지정자 constructor() {
            접근 지정자 val 또는 var 식별자 ..
                접근 지정자 get() = ...
                접근 지정자 set(value) = ..

            접근 지정자 constructor(...): this(...) ...

            접근 지정자 fun 식별자()...
         }

         접근 지정자 val 또는 var 식별자 ..

         접근 지정자 fun 식별자(...) ...
         */

    }
}