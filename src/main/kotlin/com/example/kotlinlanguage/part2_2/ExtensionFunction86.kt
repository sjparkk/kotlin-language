package com.example.kotlinlanguage.part2_2

/**
 * 확장 함수
 *
 * 클래스 밖에서 멤버 함수를 선언하는 방법에 대해 알아본다.
 * String은 코틀린에 내장된 클래스이기 때문에 우리가 마음대로 멤버 함수를 추가할 수 없다.
 * 그렇다고 String 클래스를 상속하자니, open키워드가 붙어있지 않아 불가능하다.
 *
 * 확장함수라는 문법을 이용하면 상속 없이 클래스 외부에서 멤버 함수를 추가할 수 있다.
 */
// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
// 확장 함수를 선언하는 것은 간단하다 -> 함수 이름 앞에 '함수를 주입할 클래스.'를 붙여주면 된다. -> 여기서 함수를 주입할 클래스를 리시버 타입이라고 부른다.
fun String.isNumber(): Boolean {
    var i = 0
    //this를 사용하면 리시버 타입의 프로퍼티나 멤버 함수에 접근할 수 있다. 단, private이거나 proteced인 멤버에는 접근할 수 없다.
    while (i < this.length) {
        //숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9')) {
            return false
        }
        i += 1
    }
    //모든 조건을 통과하면 true 반환
    return true
}

fun main(args: Array<String>) {
    println("1234567890".isNumber())
    println("500원".isNumber())
}