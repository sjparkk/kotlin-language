package com.example.kotlinlanguage.part2_2

/**
 * 스마트 캐스팅
 *
 * 코드의 문맥에 따라 자동으로 일어나는 캐스팅에 대해 알아본다.
 */
class SmartCasting79 {

    //특정 조건을 만족하는 경우, 컴파일러는 변수의 타입을 다른 타입으로 자동 캐스팅한다.
    //이를 스마트 캐스팅이라고 부른다.
    fun main(args: Array<String>) {
        val number: Int? = null
        val number2 = 1225

        checkNull(number)
        checkNull(number2)
    }

    fun checkNull(any: Any?) {

        //any가 null인지 검사한다.
        if(any == null) {
            println("null이 들어왔습니다.")
            return
        }

        //해당 라인까지 실행 흐름이 왔다는 것은 any가 null이 아니라는 걸 의미하기에, 특정 변수에 null 값이 들어있지 않다는 것을 완벽히 추론 해낼 수 있을 때, 그 변수는 자동으로 Not-null 타입이 된다.
        println(any.toString())
    }
}