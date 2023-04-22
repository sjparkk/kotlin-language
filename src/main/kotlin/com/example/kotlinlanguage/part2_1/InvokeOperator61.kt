package com.example.kotlinlanguage.part2_1

/**
 * 호출 연산자
 *
 * () 연산자의 기능과, () 연산자를 오버로딩하는 방법에 대해 배운다.
 */
class InvokeOperator61 {

    class Product(val id: Int, val name: String) {

        //() 연산자를 오버로딩하는 멤버 함수 Invoke를 선언한고 있다. (인수의 개수는 자유다. 생략도 가능)
        operator fun invoke(value: Int) {
            println(value)
            println("id: $id\nname: $name")
        }
    }

    fun main(args: Array<String>) {
        val product = Product(762443, "코틀린 200제")

        //product(108)은 컴파일 시 product.invoke(108)로 번역된다.
        product(108)
    }
}