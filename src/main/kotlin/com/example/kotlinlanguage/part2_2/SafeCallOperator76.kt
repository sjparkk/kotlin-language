package com.example.kotlinlanguage.part2_2

import com.example.kotlinlanguage.part2_1.Building

/**
 * 안전한 호출 연산자 ?.
 *
 * Nullable 한 참조 변수의 프로퍼티나 멤버 함수에 접근하는 방법을 배운다.
 *
 * Nullable 한 참조 변수의 접근하려면 . 대신 ?. 연산자를 반드시 사용해야 한다.
 * ?. 은 null 값에 안전한 연산자이다.
 */
class SafeCallOperator76 {

    //참조변수?.프로퍼티 / 참조변수?.멤버함수() - 참조변수가 null 일때 함수 호출 x
    fun main(args: Array<String>) {

        //Building? 타입의 참조 변수에 null 지정
        var obj: Building? = null
        //obj에는 null 이 지정되어 있어 print() 호출 무시
        obj?.print()

        //obj에 null 이 지정되어 있어 프로퍼티에 값을 집어넣는 동작 또한 무시
        obj?.name = "건물"

        //obj에 갓 생성된 Building 인스터스를 가리키게 하므로
        obj = Building()
        //프로퍼티에 값이 정상적으로 저장된다.
        obj?.name = "서울"
        //호출도 마찬가지
        obj?.print()

    }
}