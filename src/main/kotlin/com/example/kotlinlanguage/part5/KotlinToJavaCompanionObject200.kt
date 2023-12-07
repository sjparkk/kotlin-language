package com.example.kotlinlanguage.part5

/**
 * 자바에서 코틀린 코드 접근하기 : 동반자 객체
 *
 * 자바에서 코틀린의 동반자 객체에 접근하는 방법을 알아본다.
 */
class KotlinClass1 {
    companion object {
        var num = 0

        fun hello() = println("Hello")
    }
}