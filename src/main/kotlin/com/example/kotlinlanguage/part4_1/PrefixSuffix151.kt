package com.example.kotlinlanguage.part4_1

/**
 * 접두사 접미사 관련 CharSequence 확장 함수
 *
 * 접두사 접미사와 관련된 CharSequence의 확장 함수를 알아본다.
 */

fun main(args: Array<String>) {

    val str: CharSequence = "https://www.naver.com"

    /**
     * startsWith와 endsWith모두 매개인자로 ignoreCase를 가지며 기본값은 false이다.
     * true로 전달 시 대소문자를 구분하지 않는다.
     */
    println(str.startsWith("https://")) // true 반환
    println(str.endsWith(".com")) // true 반환

    println(str.removePrefix("https://")) // prefix 제거 후 출력
    println(str.removeSuffix(".com")) // suffix 제거 후 출력
    println(str.removeSurrounding("https://", ".com")) // prefix로 시작하고 suffix로 끝나면, 그 부분을 잘라낸 문자열을 반환
}