package com.example.kotlinlanguage.part5

import java.util.Scanner

/**
 * 코틀린에서 자보 코드 접근하기: 키워드 충돌
 *
 * 자바의 식별자가 코틀린의 키워드로 되어 있는 경우 어떻게 대처해야 하는지 알아본다.
 * 간혹, 코틀린에서는 키워드인 것이 자바에서 식별자로 쓰일 때가 있다.
 */
fun main(args: Array<String>) {

    //자바의 System 클래스에는 in이라는 이름의 정적 필드가 선언되어 있다. 그런데 코틀린에서는 in이라는 키워드가 이미 존재하므로 System.in과 같이 쓸수 없다.
    //이럴 때는 문제가 되는 in 식별자를 ``로 감싸주면 된다.
    val scanner: Scanner = Scanner(System.`in`)

    //추가적으로 ``은 특수 문자가 들어간 식별자를 지을 때도 사용된다. 띄어 쓰기도 가능
    val `어떤 변수`: Int = 10
    println(`어떤 변수`)

}