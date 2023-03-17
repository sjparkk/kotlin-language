package com.example.kotlinlanguage.part1_2

/**
 * 매개변수에 기본 값을 지정하는 방법을 알아본다.
 *
 * 매개변수에는 디폴트 값을 지정할 수 있다. (매개변수가 너무 많아 호출하기 번거로울 때 사용하면 좋음)
 */
fun main(args: Array<String>) {

    //이름을 생략하면 맨 오른쪽에서 하나씩 생략이 가능하다. (중간 인수만 생략 불가능)
    println(getAverage(89, 96))
    getAverage(100, 50, true)
    println(getAverage(90))

    //하지만 다음과 같이 인수를 전달할 매개변수의 이름을 직접 지정하면 중간에 있는 인수도 생략 가능하며, 순서와 상관없이 이름만 일치하면 된다.
    getAverage(66, print = true)
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30)

    //다만 여기서 주의점!! -> 매개변수의 이름을 지정한 인수는 일반 인수들보다 항상 오른쪽에 있어야 한다. (16라인 처럼.)
    //Mixing named and positioned arguments is not allowed (이름이 지정된 인수와 위치로 지정된 인수(일반 인수)는 존재할 수 없다.)
    //getAverage(print = true, 10, 30)


}

//매개 변수를 선언과 동시에 디폴트 값으로 초기화하고 있음 -> 이런식으로 하면 인수가 지정되지 않은 매개변수는 디폴트 값으로 초기화 된다.
fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double {
    val result = (a + b) / 2.0
    if(print)
        println(result)
    return result
}
