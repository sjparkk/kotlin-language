package com.example.kotlinlanguage.part2_1

/**
 * Any 클래스
 *
 * 모든 클래스가 상속하는 Any 클래스에 대해 알아본다.
 * 어떤 클래스가 아무 클래스도 상속하지 않으면 자동으로 Any라는 클래스를 상속한다.
 * 다른 클래스를 상속한다고 해도, 그 클래스 또한 Any 클래스를 자동으로 상속하므로 간접적으로 Any 클래스를 상속하게 된다.
 * 즉, 모든 코틀린 클래스들은 Any 클래스를 상속한다는 것이 보장된다.
 */
//open class Any {

    //Any 클래스에는 세가지 멤버 함수가 있다. -> 모든 클래스는 Any 클래스를 상속하므로, 코틀린의 모든 클래스는 반드시 아래의 3가지 멤버 함수를 갖는다.

//    open operator fun equals(other: Any?): Boolean
    //equals -> == 연산자를 오버로딩하는 멤버함수

//    open fun hashCode(): Int
    //객체 고유의 해시코드를 반환하는 멤버함수

//    open fun toString(): String
    // 객체의 내용을 String 타입으로 변환하는 멤버 함수
//}

class Building1(
    val name: String = ""
) {
    override fun toString(): String {
        return "이름 : ${this.name}"
    }
}

fun main(args: Array<String>) {
    val building1 = Building1("코틀린")
    printObject(building1)
}

fun printObject(any: Any) {
    //코드상으로는 Any 타입의 toString 멤버 함수를 호출하고 있지만, 다형성 덕에 실제로는
    //builing 객체의 toString()이 호출된다.
    println(any.toString())

    //추가적으로 println함수는 전달한 인수가 String 타입이 아니면 내부적으로 println(any.toString())을 호출하기 때문에 println(any)만 써도 상관없다.
}
