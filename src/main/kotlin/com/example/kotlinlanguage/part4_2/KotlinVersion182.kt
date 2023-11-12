package com.example.kotlinlanguage.part4_2

/**
 * Kotlin Version 클래스 : 사용중인 코틀린 버전 알아내기
 *
 * 사용 중인 코틀린 버전을 조사하는 방법을 배운다.
 * KotlinVersion 클래스를 이용하면 현재 사용중인 코틀린 버전을 알아낼 수 있다.
 *
 * class KotlinVersion(major: kotlin.Int, minor: kotlin.Int, patch: kotlin.Int) : Comparable<KotlinVersion>
 * 다음과 같이 Comparable 인터페이스를 구현하고 있기 때문에 <, > 연산자로 대소 비교도 가능하다.
 */
fun main(args: Array<String>) {

    //CURRENT 프로퍼티의 현재 코틀린 버전을 같은 KotlinVersion 객체가 담겨 있다.
    val kotlinVersion = KotlinVersion.CURRENT
    println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}")

    //isAtLeast 함수를 사용하면 코틀린이 특정 버전 이상인지를 쉽게 파악할 수 있다.
    println(kotlinVersion.isAtLeast(1, 1, 0))
}