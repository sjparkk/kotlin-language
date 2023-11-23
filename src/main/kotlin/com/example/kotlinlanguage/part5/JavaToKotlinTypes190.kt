package com.example.kotlinlanguage.part5

/**
 * 코틀린에서 자바 코드 접근하기: 타입
 *
 * 코틀린에서 자바로 작성된 코드를 불러올 때 타입이 어떻게 매핑되는지 알아본다.
 *
 * 자바 타입             코틀린 타입
 * byte, Byte         Byte, Byte!
 * short, Short       Short, Short!
 * int, Integer       Int, Int!
 * long, Long         Long, Long!
 * float, Float       Float, Float!
 * double, Double     Double, Double!
 * boolean, Boolean   Boolean, Boolean!
 * java.lang.String   kotlin.String!
 * void, Void         Unit
 * byte[]             ByteArray!
 * short[]            ShortArray!
 * int[]              IntArray!
 * long[]             LongArray!
 * float[]            FloatArray!
 * double[]           DoubleArray!
 * boolean[]          BooleanArray!
 * T[]                Array<T>!
 * Object             Any
 */
fun main(args: Array<String>) {

    //코틀린에서 Math.random을 부르면 double 타입이 코틀린의 Double 타입으로 변환되므로 반환 값이 문제 없이 rand 변수에 대입된다.
    val rand: Double = Math.random()
    println(rand)

    //자바에서 선언된 StringBuffer 클래스를 코틀린에서 사용하고 있다.
    val buffer: StringBuffer = StringBuffer()

    //append메서드는 java.lang.String 타입의 인수를 받지만, 코틀린에서 호출할 때는 kotlin.String 타입으로 변환되므로, 문제없이 리터럴을 전달할 수 있다.
    buffer.append("hello,")
    buffer.append("world!")

    val result = buffer.toString() // 코틀린에서 toString을 호출하면 kotlin.String 타입으로 변환되므로 문제없이 result 변수에 대입 된다.
    println(result)
}