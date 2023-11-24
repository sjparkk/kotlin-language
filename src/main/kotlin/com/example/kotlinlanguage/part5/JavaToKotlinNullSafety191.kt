package com.example.kotlinlanguage.part5

/**
 * 코틀린에서 자바 코드 접근하기 : null 안전성
 *
 * 타입 이름 뒤에 붙은 느낌요 ! 의 정체에 대해 자세이 알아본다.
 *
 * 자바의 참조 타입을 코틀린으로 불러오면 타입 이름 뒤에 느낌표가 붙는다.
 * 타입 이름 뒤에 느낌표는 이 타입이 Nullable인지 Not-Null 인지 알 수 없다는 뜻이다. (느낌표는 실제 문법이 아니기 때문에 타입 이름 뒤에 느낌표를 적으면 오류가 발생한다. IDE에서 Nullable인지 Not-Null인지 알 수 없음을 느낌표로 표시하는 것일 뿐)
 * 참조 타입은 무조건 null을 허용하기 때문에 이런 일이 벌어진다. 반면 int와 같은 원시 타입의 경우 null 값이 들어갈 수 없으므로 느낌표 없이 Int 타입으로 인식된다.
 * 자바에 선언된 인터페이스를 코틀린에서 구현하는 예제를 통해 타입의 Nullable이 어떻게 처리 되는지 알아본다.
 */
class KotlinClass: JavaInterface1 {
    //String! 타입은 String?이나 String으로 적을 수 있다. 일반적으로 String?으로 적어주는 것이 안전하며, 절대로 null이 들어오지  않은 다는 확신이 있다면 String으로 써도 무방한다.
    //단 String으로 적었는데 null 값이 들어온다면 KotlinNullPointerException이 발생한다.
    override fun trim(str: String?): String {
        return str?.trim() ?: ""
    }
}

fun main(args: Array<String>) {
    val javaInterface: JavaInterface1 = KotlinClass()
    println(javaInterface.trim(" hi "))
}