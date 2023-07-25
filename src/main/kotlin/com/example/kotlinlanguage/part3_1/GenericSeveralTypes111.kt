package com.example.kotlinlanguage.part3_1

/**
 * 여러 타입을 인수로 받기
 *
 * 타입 매개변수를 여러 개 선언하는 방법을 알아본다.
 */

//타입 인수를 여러 개 받으려면 fun 키워드와 함수 이름 사이를 <타입 1, 타입2, ...> 형식으로 적는다.
//타입 매개변수 T와 R을 선언하여, 두 개의 타입 인수를 받을 수 있게 했다.
//mapper 매개 변수에는 T타입을 R타입으로 변환하는 함수를 받도록 했다.
fun <T, R> T.map(mapper: (T) -> R): R {
    //매개변수로 받은 mapper 함수에 리시버(this)를 넣어 호출한 뒤 반환 값을 그대로 반환한다.
    return mapper(this)
}

fun main(args: Array<String>) {

    //11에 map 확장함수를 호출한 뒤, 제곱을 반환하는 함수를 mapper 매개변수로 전달했다.
    val square: Int =
        11.map { // 원래는 11.map<Int, Int>로 써야하지만 타입 추론이 가능하기 때문에 생략
            it * it
        }
    println(square)
}