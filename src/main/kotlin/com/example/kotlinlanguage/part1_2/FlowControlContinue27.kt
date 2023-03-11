package com.example.kotlinlanguage.part1_2

/**
 * 반복문의 내용 일부를 건너뛰는 방법을 배운다.
 *
 * continue 키워드를 사용하면 반복문의 일부 문장을 무시하고 건너뛸 수 있다.
 */
fun main(args: Array<String>) {

    var i = 0

    while (i < 10) {

        i += 1

        //짝수이면
        if(i % 2 == 0) {
            // continue 아래 문장들을 모두 skip
            // continue 실행되는 순간 곧바로 가장 가까운 반복문의 첫 부분으로 실행 흐림이 순간이동한다.
            continue
        }
        print(i)
    }

    //출력 결과
    //13579
}