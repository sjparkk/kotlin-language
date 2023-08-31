package com.example.kotlinlanguage.part3_2

/**
 * sealed 클래스
 *
 * 자신의 중첩 클래스에만 상속을 허용하는 sealed 클래스에 대해 알아본다.
 */

//sealed 클래스는 자신의 중첩 클레스에만 상속을 허용하는 클래스이다.
sealed class Outer {

    //Outer클래스는 자신의 중첩 또는 내부 클래스에서만 상속이 가능하다.
    //이 말은 Outer 클래스 자체로는 인스턴스를 만들 수 없다는 말이다.
    class One: Outer()
    class Two: Outer()
    class Three: Outer()
}

//class Four: Outer() -> Outer 클래스는 자신의 중첩 클래스에서만 상속이 가능하므로 해둥 주석 해제 시 오류가 발생

fun main(args: Array<String>) {

    val instance: Outer = Outer.Three()

    //instance 변수의 실제 타입을 판별하여 대응되는 String 리터럴로 반환하는 when 표현식
    val text: String = when(instance) {
        //sealed 클래스는 서브클래스가 sealed 클래스 안에 모두 존재하므로, 모든 서브 타입을 체크했다면 when의 else블록을 생략해도 표현식을 구성할 수 있다.
        is Outer.One -> "첫번째"
        is Outer.Two -> "두번째"
        is Outer.Three -> "세번째"
    }

    //세번째 출력
    println(text)

    //1.1버전 이후에는 sealed 클래스와 같은 파일에 속해 있기만해도 sealed 클래스를 상속할 수 있다.
}