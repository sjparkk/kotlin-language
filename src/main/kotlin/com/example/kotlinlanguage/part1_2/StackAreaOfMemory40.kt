package com.example.kotlinlanguage.part1_2

/**
 * 메모리의 스택 영역
 *
 * 지역 변수가 실제로 어디에 생성되는지 살펴본다.
 * 지금까지는 단순히 변수를 선언하면 메모리의 변수를 위한 공간이 생성된다고 배웠지만 해당 예제에서
 * 좀 더 구체적으로 지역 변수가 어디에 어떤 모습으로 생성되는지 알아본다.
 *
 * 메모리에는 스택(stack)이라는 영역이 있는데, 해당 영역에 지역 변수가 저장된다.
 * 번수가 생성될 때 생성된 순서대로 차곡차곡 스택에 쌓인다.
 */
fun main(args: Array<String>) {

    //메인 함수가 시작되면서 매개변수 arge가 생성된다.

    //a 가 스택 영역에 쌓인다.
    val a = -36

    //absolute 함수 호출 -> 호출 후 반환되어 number 매개 변수가 스택 영역에서 사라짐 -> result 가 선언되어 스택에 쌓임
    val result = absolute(a)
    println(result)

    //프린트 이후 main 함수 종료 시 모든 지역 변수가 스택 영역에서 사라짐
}

//absolute 함수가 실행되면서 매개변수 number가 생성되어, 스택에 쌓인다.
fun absolute(number: Int): Int {
    return if(number >= 0)
        number
    else -number
}