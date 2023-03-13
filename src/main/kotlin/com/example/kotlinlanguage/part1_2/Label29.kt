package com.example.kotlinlanguage.part1_2

/**
 * if 와 else 안에 또 다른 if와 else를 넣을 수 있음을 이해한다.
 */
fun main(args: Array<String>) {

    //다음과 같이 반복문을 이용하여 연립 방정식의 해를 구하는 코드를 가정
    var x = 0
    var y = 0

    //다음과 같은 코드에서는 break 문을 사용하면 가장 가까운 반복문 '하나만' 빠져나온다.
    //가장 밖에 있는 while문 까지 빠져나와 맨 마지막에 있는 println 문을 출력하고 싶을 때 레이블 문법을 사용한다.
//    while(x <= 20) {
//        y = 0
//        while (y <= 20) {
//            if(x + y == 15 && x - y ==5) {
//                break
//            }
//            y += 1
//        }
//        x += 1
//    }
//
//    println("x: $x, y : $y")

    /**
     * 레이블 문법 사용
     */
    outer@ while(x <= 20) {
        y = 0
        while (y <= 20) {
            if(x + y == 15 && x - y ==5) {
                //break@레이블 이름을 실행하면 그 레이블에 해당하는 반복문을 빠져나오게 된다.
                break@outer
            }
            y += 1
        }
        x += 1
    }

    println("x: $x, y : $y")
}