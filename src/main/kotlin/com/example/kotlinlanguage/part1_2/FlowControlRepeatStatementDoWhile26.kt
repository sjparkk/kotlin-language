package com.example.kotlinlanguage.part1_2

/**
 * 조건이 마지막에 오는 while 문에 대해 알아본다.
 *
 * do-while도 문장 마지막에서 조건을 검사한다는 점만 빼면 while과 동일하다.
 */
fun main(args: Array<String>) {

    //기본 형태는 다음과 같음
//    do {
//        do-while에 포함시킬 문장들
//    } while (Boolean 표현식)


    var i = 1

    // do-while문의 특징은 조건을 검사하는 부분이 맨 뒤로 옮겨져있어 do-while 내 블록이 적어도 한번은 무조건 실행된다는 점이다.
    // 이러한 특성을 이해하고 다음과 같은 조건 필요 시 사용한다.
    do {
        println("실행됨")
    } while (i == 0)

}