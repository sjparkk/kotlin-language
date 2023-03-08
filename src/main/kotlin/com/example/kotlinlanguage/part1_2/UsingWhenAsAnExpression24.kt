package com.example.kotlinlanguage.part1_2

/**
 * when 을 표현식으로 사용하는 법을 알아본다.
 *
 * when도 if처럼 else블록을 포함고 있다면 표현식이 된다.
 */
fun main(args: Array<String>) {

    val score = 95


    //조건에 맞는 값에 따라 when 표현식 전체는 'A' ~ 'F'로 대체된다.
    val grade = when (score / 10) {
        //실행 시 when 블록 빠져나옴
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }

    //다음과 같이 when 을 if-else 처럼 사용 할수도 있다.
    val grade1 = when {
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    }

    println(grade)
}