package com.example.kotlinlanguage.part1_2

/**
 * 스코프가 다르면 변수의 이름이 중복될 수 있음을 이해한다.
 *
 * 한 블록 내에서 변수의 이름은 중복될 수 없지만, 지역 변수와 전역 변수는 이름이 중복될 수 있다.
 */
//전역 변수 a
var a = 5

fun main(args: Array<String>) {

    //지역 변수 a
    //전역 변수와 지역 변수 간에는 이름의 중복을 허용하기 때문에 오류 발생 x
    val a = 30
    //다음 함수를 실행하게 되면 이름이 중복된 변수에 접근할 때는 현재 실행되고 있는 코드와 가장 가까운 스코프의 변수가 우선적으로 인삭
    println(a)
    func()
}

fun func() {
    println(a)
}


