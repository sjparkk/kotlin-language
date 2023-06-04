package com.example.kotlinlanguage.part3_1

/**
 * Nullable 리시버
 *
 * 확장 함수를 응용하여 Nullable 타입으로도 멤버 함수를 호출할 수 있도록 해본다.
 */
//확장함수를 응용하면, 참조 변수에 null이 지징되어 있어도 함수 호출이 가능하게 할 수 았다.
fun String?.isNumber() {
    if(this == null)
        println("문자열이 null입니다.")
}

fun main(args: Array<String>) {

    //리시버 타입에 ?가 붙어 있으면 Nullable 리시버이다.
    //String? 타입에 null이 지정되어 있다.
    val empty: String? = null

    //isNumber 확장 함수의 리시버 타입이 Nullable 이기 때문에, 표현식의 값이 null이어도 isNumber확장 함수를 호출할 수 있다.
    empty.isNumber()

}