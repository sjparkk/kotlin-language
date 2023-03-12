package com.example.kotlinlanguage.part1_2

/**
 * 반복문 실행 중 반복문을 빠져나오는 방법을 배운다.
 *
 * break 키워드를 사용하면 반복문을 즉시 탈출할 수 있다.
 */
fun main(args: Array<String>) {

    var i = 0

    //다음과 같이 true 조건을 주면 무한루프 이용 가능
    while (true) {

        i += 1


        if(i >= 5) {

            //이 문장이 실행되는 순간 while 블록을 탈출한다.
            //즉 해당 무한 루프 종료
            break
        }
        print(i)
    }

    //출력 결과
    //1234 -> 5조건에서 while문이 종료
}