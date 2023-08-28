package com.example.kotlinlanguage.part3_2

/**
 * 열거 클래스(Enum Class)
 *
 * 정해진 집합 내의 값을 표현하기 위한 열거 클래스에 대해 알아본다.
 *
 * 그림판 프로그램을 만든다 가정 할 때 선택모드, 펜모드, 도형모드, 지우개모드 등 여러 가지 모드가 있다.
 * 현재 선택된 모드를 저장할 때 지우개모드 = 1, 펜모드 = 2 와 같은 방식은 숫자의 의미를 항상 기억해야 하므로 이러한 방식보다는
 * 열거 클래스를 사용하는 것이 좋다.
 */

//열거 클래스를 선언 시 클래스 선언문 앞에 enum 키워드를 붙인다.
enum class Mode {

    //열거 클래스에 포함시킬 식별자를 쉼표를 이용해 나열하며, 식별자는 모두 대문자로 하는 것이 좋다.
    //열거 클래스에 들어가는 식별자를 열거 상수라고 한다.
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>) {

    //현재 선택된 모드
    val mode: Mode = Mode.PEN

    //펜 모드 출력
    when(mode) {
        Mode.SELECTION -> println("선택 모드")
        Mode.PEN -> println("펜 모드")
        Mode.SHAPE -> println("도형 모드")
        Mode.ERASER -> println("지우개 모드")
    }
}

