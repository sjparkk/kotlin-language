package com.example.kotlinlanguage.part1_3

/**
 * 소스 파일 여러 개로 분리하기
 *
 * 소스 파일을 여러 개로 분리하는 방법을 알아본다.
 * 프로그램 규모가 커지면 한 파일에 모든 코드를 넣기 버거워지기 때문에 소스 파일 하나를 여러 개로 분리하는 방법에 대해 알아본다.
 */

//수학 관련 함수 max, min, abs를 Math.kt 파일로 분리
//다음과 같이 서로 관련 있는 함수끼리 묶어 관리하면 다른 프로젝트에 추가하기만 하면 되므로 재사용성이 좋아진다.
class Math {

    //a와 b 중 더 큰수를 반환하는 함수
    fun max(a: Int, b: Int): Int =
        if(a > b) a else b

    //a와 b 중 더 작은 수를 반환하는 함수
    fun min(a: Int, b: Int): Int =
        if(a < b) a else b

    //num의 절대값을 반환하는 함수
    fun abs(num: Int): Int =
        if(num >=0) num else -num
}

//정리를 위해 하나의 파일로 예시
class EX_SplitSourceFile {
    fun main(args: Array<String>) {
        val a = 20
        val b = -30

        //println(max(a, b))
    }
}