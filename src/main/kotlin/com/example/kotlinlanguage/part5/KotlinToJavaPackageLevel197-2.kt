//해당 어노테이션은 KotlinToJavaPackageLevel197-2.kt 에 대한 클래스 이름을 KotlinToJavaPackageLevel197-2.kt가 아닌 MyKotlin으로 만들도록 코틀린 컴파일러에게 지시하는 것
@file:JvmName("MyKotlin")

package com.example.kotlinlanguage.part5

/**
 * 자바에서 코틀린 코드 접근하기: 패키지 레벨 변수 함수
 *
 * 자바 코드에서 코틀린의 패키지 레벨 변수와 함수에 접근하는 방법을 알아본다.
 */

fun func2() = println("From KotlinToJavaPackageLevel197-2.kt")