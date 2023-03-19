package com.example.kotlinlanguage.part1_2

/**
 * 개수가 정해지지 않은 매개변수를 만드는 방법을 알아본다.
 */
fun main(args: Array<String>) {

    println(getSumOf(1, 2, 3, 4, 5, 6, 7))
    println(getSumOf(32, 57, 12))
    //가변 인수에는 다음과 같이 아무 인수도 지정하지 않을 수도 있다.
    println(getSumOf())

}

//매개변수 앞에 vararg 키워드를 붙이면 여러개의 인수를 받을 수 있게 된다.
//something 과 같이 일반 인수와도 함께 사용 가능.
fun getSumOf(vararg numbers: Int/*, something: Char*/): Int {

    val count = numbers.size
    var i = 0; var sum = 0

    while (i < count) {
        sum += numbers[i]
        i += 1
    }

    return sum
}