package com.example.kotlinlanguage.part1

/**
 * 특정 타입에 또 다른 이름울 붙이는 방법에 대해 알아본다.
 */

//typealias 키워드를 사용하면 이미 존재하는 타입에 별명을 붙일 수 있다.
typealias  Number = Int

fun main(args: Array<String>) {

    // Number == Int 타입, 타입의 이름이 길 때, 타입 이름을 줄이는 용도로 사용됨.
    val a: Number = 10
    println(a)

}