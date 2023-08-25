package com.example.kotlinlanguage.part3_2

/**
 * 흐름 제어 - 반복문 for
 *
 * 특정 구간의 데이터를 하나씩 꺼내 필요한 처리를 할 수 있게 해주는 for문에 대해 알아본다.
 */

//for도 while과 같이 코드를 반복하는 반복문의 일종이다.
//for문의 소괄호 안에 선언된 변수는 스코프가 for문 안으로 한정되며, in 우측 표현식 속의 데이터를 하나씩 받는데 사용한다.
//for (변수 이름: 타입 in 표현식) {...}

fun main(args: Array<String>) {

    //iter는 1..10 구간 속의 특정 원소를 가리키고 있다.
    //val iter: Iterator<Int> = (1..10).iterator()
    //while(iter.hasNext()) {
    // val i = iter.next() // 매 반복마다 i에는 1,2,3, ... , 10의 값이 들어간다.
    for(i: Int in 1..10) {
        print("$i ")
    }
    println()

    //코틀린 컴파일러는 IntRange가 적용된 for문을 다음과 같은 꼴로 최적화해준다.
    //for(i = 1; i <= 10; i++)
    for(i: Int in 1..10) {
        if(i > 5)
            break

        print("$i ")
    }
}
