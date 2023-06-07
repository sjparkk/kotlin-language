package com.example.kotlinlanguage.part3_1

/**
 * 추상 클래스
 *
 * 몸체가 비어있는 멤버 함수를 갖는 추상 클래스에 대해 알아본다.
 *
 * 상속을 사용하다보면 단순히 여러 타입을 하나의 타입으로 묶는 용도로 쓸 때가 많다.
 */
//학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
//여기서 Person3는 단순히 Student, Professor, Employee 클래스는 Person3 타입으로 묶기 위한 클래스이며, 각 서브 클래스에 getSalary라는 멤버 함수를 전파시키고 있다.
//open class Person3 {
//    open fun getSalary() = 0
//}
//이렇듯 공통되는 멤버를 전파하는 용도로 쓰는 클래스는 추상 클래스로 선언하는 것이 좋다.
//클래스를 추상 클래스로 만드려면, 클래스 선언 맨 앞에 abstract 키워드를 붙인다.
//추상클래스는 일부 멤버의 내용이 비어 있는 불완전한 클래스이기 때문에 객체를 생성할 수 없다.
//abstract는 자체로 open 키워드를 포함하고 있기 때문에 적지 않아도 된다.
abstract class Person3 {
    //추상클래스는 추상 멤버함수를 가질 수 있다.
    //추상 멤버 함수란, 내용이 없는 멤버 함수를 뜻한다. -> 추가적으로 추상 프로퍼티도 가질 수 있으며, 마찬가지로 맨앞에 abstract 키워드를 붙여주면 된다.

    //getSalary() 멤버 함수는 그저 서브 클래스로 전파시키기 위해 선언한 것이므로, 함수 내용이 굳이 필요 없다.
    abstract fun getSalary(): Int
}

/**
 추상 클래스를 상속하는 일반 클래스는 반드시 모든 추상 멤버 함수를 오버라이딩 해야 한다.

 만약 추상 클래스를 상속하는 추상 클래스가 있다면 이때는 반드시 오버라이딩을 하지 않아도 된다.
 */

//학생 클래스. tuition는 한 학기 등록금
class Student(private val tuition: Int): Person3() {
    //학생은 등록금을 납부하므로 salary를 음수 처리
    override fun getSalary() = -tuition
}

//교수 클래스. classCount는 진행하는 수업의 수
class Professor(private val classCount: Int): Person3() {
    override fun getSalary() = classCount * 120
}

//학교 직원 클래스. initial은 초봉(반기), years는 경력(년)
class Employee(private val initial: Int, private val years: Int): Person3() {
    override fun getSalary() = initial * (1.0 + years / 10.0).toInt()
}

//구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons: Person3): Int {

    var i = 0
    var finance = 0
    while(i < persons.size) {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args: Array<String>) {
    val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2), Employee(1300, 2))

    println("학교 재정 : $finance 만원")
}