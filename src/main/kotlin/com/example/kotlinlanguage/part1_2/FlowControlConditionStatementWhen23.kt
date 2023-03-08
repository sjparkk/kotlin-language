package com.example.kotlinlanguage.part1_2

/**
 * 조건문의 일종인 when 문에 대해 배운다.
 *
 * when도 if와 같이 조건에 따라 문장 실행 여부를 결정하는 키워드
 * when은 java의 switch-case의 업그레이드 버전
 */
fun main(args: Array<String>) {

    //다음과 같은 형태로 사용
//    when(타깃 표현식) {
//        타깃 표현식과 비교할 값 -> {
//            N개의 문장
//        }
//    }


    val score = 64

    /**
     * { } 중괄호는 문장이 하나일 때 생략 가능하다.
     */
    when(score/10) {
        //실행 시 when 블록 빠져나옴
        6 -> { println('D') }
        7 -> { println('C') }
        8 -> { println('B') }
        9, 10 -> { println('A') }
        // 모든 비교 값과 같지 않을 때 실행되는 부분
        else -> { println('F') }
    }

    println("test")
}