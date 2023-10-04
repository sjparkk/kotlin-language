package com.example.kotlinlanguage.part4_2

/**
 * CharSequence 쪼개기
 *
 * CharSequence를 여러 조각으로 쪼개는 확장 함수를 알아본다.
 */
fun main(args: Array<String>) {

    val hello: CharSequence = "안녕하세요. \n 고맙습니다.\n 반갑습니다."
    val time: CharSequence = "2018-01-22"

    //lines()는 개행 문자를 기준으로 쪼갠다.
    println(hello.lines()) // [안녕하세요. ,  고맙습니다.,  반갑습니다.]

    //lineSequence()는 개행 문자를 기준으로 CharSequence를 쪼개 Sequence<String> 타입으로 반환
    for (line in hello.lineSequence())
        println(line)

    /**
     split은 다음과 같이 선언되어 있는데 delimiters는 문자열을 쪼갤 구분자이며, limit은 문자열을 최대 몇 조각으로 쪼갤것인지를 정한다.(0이면 쪼갤 수 있을 때까지 문자열을 쪼갬)
    public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = false, limit: Int = 0): List<String> {
        if (delimiters.size == 1) {
            return split(delimiters[0].toString(), ignoreCase, limit)
        }

        return rangesDelimitedBy(delimiters, ignoreCase = ignoreCase, limit = limit).asIterable().map { substring(it) }
    }
     */
    println(time.split('-')) // [2018, 01, 22]
}