package com.example.kotlinlanguage.part1_1

/**
 * 소스코드에 메모를 다는 방법을 배운다.
 *
 * 코드의 동작을 자연어로 설명할 수 있도록 주석이라는 문법을 제공.
 * 주석은 소스코드에 달아 놓는 메모를 뜻함
 */
fun main(args: Array<String>) {

    //Apple을 화면에 출력한다.
    println(/* 이 부분은 컴파일러가 통째로 무시함. */"Apple"/*이
    부
    분
    도
    */)

    // <- //를 적은 순간부터 그 뒤에 오는 소스코드는 컴파일러가 모조리 무시

    /* */ // 이것은 구간 주석, 시작과 끝을 지정 가능

    //주석은 본래 코드에 설명을 다는 역할이지만, 특정 코드를 임시적으로 비활성화할 때 사용하기도 함.

    val a = 15
    val b = a + 5/3.0

    //테스트로 b에 값이 잘 저장되어 있는지 확인하기 위해 b 값 출력
    println(b)

    //최종 결과 출력
    println(a+b)


}