package com.example.kotlinlanguage.part4_1

/**
 * CharSequence 가공하기
 *
 * CharSequence을 가공하는 확장 함수를 알아본다.
 */
fun main(args: Array<String>) {

    val str = "   hello   "

    //lo가 출력된다. 해당 지정 범위만큼 제거
    println(str.removeRange(0..5))

    //문자열의 길이를 설정 길이만큼 늘린 후 앞부분의 빈공간을 설정 문자로 채운 후 반환한다.
    println(str.padStart(20, '*'))
    //문자열의 길이를 설정 길이만큼 늘린 후 뒷부분의 빈공간을 설정 문자로 채운 후 반환한다.
    println(str.padEnd(17, '*'))

    //앞부분 공백 제거
    println(str.trimStart())
    //뒷부분 공백 제거
    println(str.trimEnd())
    //앞뒤 공백 제거
    println(str.trim())

    //아래 확장 함수 모두 지정한 범위의 문자열을 잘라낸 뒤 반환
    println(str.slice(4..6))
    println(str.subSequence(4..6))
    println(str.substring(4..6))

    /**
     * 추가적으로 이렇게 동일한 동작을 하지만 차이점이 있을 것, 어떤 차이점이 있나?
     *
     * slice
     * - 컬렉션이나 시퀀스에서 요소 추출 시 사용
     * - 지정된 범위의 문자를 포함하는 새 문자열을 반환
     * - 지정된 문자를 사용하여 새 문자열 복사본을 만듦
     *
     * subSequence
     * - CharSequence를 반환
     * - 새 문자열 복사본을 생성하는 것이 아닌 원래 문자열에 대한 보기를 제공하므로 큰 문자열로 작업할 때 메모리 효율성이 더 높음
     *
     * subString
     * - 지정된 범위의 문자를 포함하는 새 문자열 반환
     * - 범위는 처음에는 포함되지만 끝에서는 제외
     * - slice와 마찬가지로 지정된 문자로 새 문자열 복사본을 만듦
     */

    //문자들을 거꾸로 뒤집은 문자열 반환
    println(str.reversed())

}