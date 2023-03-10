package com.example.kotlinlanguage.part1_2

/**
 * 특정 문장을 반복하는 방법을 배운다.
 *
 * while은 특정 문장을 반복할 때 사용하는 키워드이다.
 */
fun main(args: Array<String>) {

    //기본 형태는 다음과 같음
//    while (Boolean 표현식) {
//        while 에 포함시킬 문장들
//    }

    var i = 1

    //조건이 true이면 while 블록 내 문장을 실행한다.
    //if-else는 블록 속의 문장이 모두 끝나면 블록을 빠져나오지만 while은 다시 처음으로 되돌아가 조건을 확인한다.
    //이렇듯 특정 문장을 반복하는 문장을 반복문이라고 한다.
    while (i < 10) {
        println(i)
        i += 1
    }
    //조건을 만족하지 못하면 빠져나옴.

    /**
     * 추가적으로 while 사용 시 무한 루프에 빠지지 않게 주의할 것. (의도적으로는 사용 가능)
     *
     * while 블록 전체도 while 바깥에서는 문장 한 개로 인식
     */
}