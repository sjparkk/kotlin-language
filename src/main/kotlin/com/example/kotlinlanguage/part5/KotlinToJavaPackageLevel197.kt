package com.example.kotlinlanguage.part5

/**
 * 자바에서 코틀린 코드 접근하기: 패키지 레벨 변수 함수
 *
 * 자바 코드에서 코틀린의 패키지 레벨 변수와 함수에 접근하는 방법을 알아본다.
 */

//코틀린 파일에 선언 된 패키지 레벨의 변수 함수들은 파일명kt 클래스의 static 멤버로 들어간다.
//패키지 레벨의 변수는 오로지 Getter와 Setter를 통해서만 접근할 수 있다.
val a = 10 // 변수 a에 접근하려면 getA를 호출해야한다.

fun func() = println("Hello")

fun Int.extension() = println(this)