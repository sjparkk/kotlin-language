package com.example.kotlinlanguage.part1_2

/**
 * if와 else 안에 또 다른 if 와 else 를 넣을 수 있음을 이해한다.
 *
 * 이를 이용하여 여러 가지 조건을 처리하는 것이 가능하다.
 */
fun main(args: Array<String>) {

    val score = 88

    //원하는 결과를 찾을 수 있지만 들여쓰기가 너무 많아 가독성이 떨어짐
    if(score >= 90) {
        println('A')
    } else {

        //실행
        if(score >= 80) {
            println('B')
        } else {

            if(score >= 70) {
                println('C')
            } else {
                println('F')
            }
        }
    }


    //if-else 를 이용하여 축약해주면 가독성이 좋아짐.
    if (score >= 90) {
        println('A')
    } else if (score >= 80) {
        println('B')
    } else if (score >= 70) {
        println('C')
    } else {
        println('F')
    }





}