package com.example.kotlinlanguage.part4_1

/**
 * 비어 있는 CharSequence 인지 검사하기
 *
 * CharSequence가 비어 있는지 검사하는 확장 함수를 알아본다.
 */
fun main(args: Array<String>) {

    val emptyStr = ""
    val whiteSpaces = " "
    val nullStr: String? = null

    //isEmpty()는 문자열이 비어 있는지, 즉 ""와 같은지 여부를 반환하는 확장함수
    println(emptyStr.isEmpty()) //true
    println(whiteSpaces.isEmpty()) //false -> " " 공백 존재

    //isBlank()는 문자열이 비어 있거나 공백 문자로 이루어져 있는지의 여부를 반환
    println(emptyStr.isBlank()) // true
    println(whiteSpaces.isBlank()) // true

    // 문자열이 Null 이거나 비어 있는지 여부를 반환
    println(nullStr.isNullOrEmpty())

    // 문자열이 Null 이거나 공백 문자로 이루어져 있는지 여부를 반환
    println(nullStr.isNullOrBlank())
}