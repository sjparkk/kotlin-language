package com.example.kotlinlanguage.part4_1

/**
 * Iterable 인터페이스 : 클래스가 반복자를 지원하도록 하기
 *
 * Iterable 인터페이스의 기능과 이들을 상속하는 IntProgression, LongProgression, CharProgression 인터페이스에 대해 알아본다.
 *
 * Iterable 인터페이스는 클래스에 operator fun iterator(): Iterator<T> 연산자 멤버 함수를 주입하기 위한 인터페이스이다.
 *
 * interface Iterable<out T> {
 *  operator fun iterator(): Iterator<T>
 * }
 */

//IntRange는 IntProgression과 ClosedRange인터페이스를 구현하며, Iterable<Int>를 상속하며, 이 인터페이스 덕에 IntRange의 인스턴스를 for문의 in 연산자를 쓸 수 있다.
//각 Progression에는 다음과 같은 프로퍼티가 있다.
//open class IntProgression { Progresasion이라는 이름의 중간 인터페이스가 있는 것은 아니다.
//    val first: Int 시작을 가리키는 프로퍼티
//    val last: Int 끝을 가리키는 프로퍼티
//    val step: Int 반복자의 next를 호출할 때 몇 칸씩 건너뛸 것인지를 나타내는 프로퍼티
//}

fun main(args: Array<String>) {

    val prog: IntProgression = 3..7
    println(prog.first)
    println(prog.last)
    println(prog.step) //step 기본값은 1

    for (i in prog)
        print("$i")
}