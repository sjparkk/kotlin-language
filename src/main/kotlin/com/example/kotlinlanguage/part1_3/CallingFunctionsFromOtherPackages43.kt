package com.example.kotlinlanguage.part1_3

/**
 * 다른 패키지의 함수 호출하기
 *
 * 다른 패키지의 소스 파일에 선언된 함수를 호출하는 방법을 알아본다.
 *
 * 소스 파일이 서로 같은 패키지 안에 있으면 자유롭게 서로의 파일에 선언된 함수를 호출할 수 있지만,
 * 각각 다른 패키지에 있다면 그럴 수 없음
 *
 */
class CallingFunctionsFromOtherPackages43 {

    fun main(args: Array<String>) {

        //다른 패키지의 소스 파일에 선언된 함수를 호출할 때 다음과 같이 패키지이름.함수 이름() 을 사용하면 된다.
        println(com.example.kotlinlanguage.ex_package.max(30,10))
    }
}