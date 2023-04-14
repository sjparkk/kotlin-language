package com.example.kotlinlanguage.part2_1

/**
 * init 블록 나누어 쓰기
 *
 * init 블록을 나누어 쓸 수 있음을 알아보고, 프로퍼티의 선언과 동시에 초기화와 init 블록이 실행되는 순서도 알아본다.
 */
class Size(width: Int, height: Int) {

    //인스턴스 생성 요청이 온다고 init 블록이 곧장 실행되는 것이 아닌 위에서 부터 순서대로 프로퍼티의 선언 및 초기화 문과 init 블록이 실행된다.

    //다음과 같이 선언과 동시에 초기화도 가능
    val width = width

    //선언 후 아래 init 블록 내에서 초기화 함
    val height: Int

    //다음과 같이 init 블록을 나누어 선언 가능
    init {
        this.height = height
    }

    //area도 마찬가지로 아래 init에서 초기화 (만약 init 블록이 없거나 바로 초기화 하지 않으면 다음 에러 발생 -> Property must be initialized or be abstract)
    val area: Int

    init {
        area = width * height
    }
}

fun main(args: Array<String>) {

    //Size 인스턴스 생성
    val size = Size(10, 50)
    println(size.area)
}