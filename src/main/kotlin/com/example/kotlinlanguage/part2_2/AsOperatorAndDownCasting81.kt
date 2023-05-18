package com.example.kotlinlanguage.part2_2

import com.example.kotlinlanguage.part2_1.Person3
import com.example.kotlinlanguage.part2_1.Student

/**
 * as 연산자와 다운캐스팅
 *
 * 다운캐스팅의 개념과 코틀린에서 다운캐스팅을 하는 방법을 배운다.
 */

fun main(args: Array<String>) {

    //다운캐스팅은 업캐스팅과는 반대로 슈퍼클래스 타입을 서브클래스 타입으로 받는 것을 뜻한다.
    val person: Person3 = Student("John", 32, 20171228)
    val person2: Person3 = Person3("Jack", 29)

    // as 연산자는 왼쪽 피연산자의 타입을 오른쪽 피연산자로 캐스팅한다.
    //person 참조 변수가 가리키고 있는 객체는 Student 타입이므로 무사히 캐스팅이 된다.
    var person3: Student = person as Student

    //person2 참조변수를 Student 타입으로 캐스팅하고 있다. person2 참조변수는 Person의 인스턴스를 가리키고 있으므로 ClassCastException 예외가 발생한다.
    //Exception in thread "main" java.lang.ClassCastException: class com.example.kotlinlanguage.part2_1.Person3 cannot be cast to class com.example.kotlinlanguage.part2_1.Student (com.example.kotlinlanguage.part2_1.Person3 and com.example.kotlinlanguage.part2_1.Student are in unnamed module of loader 'app')
    //	at com.example.kotlinlanguage.part2_2.AsOperatorAndDownCasting81Kt.main(AsOperatorAndDownCasting81.kt:23)
//    person3 = person2 as Student

    //만약 캐스팅에 실패했을 때 예외가 발생하는 것을 막고 싶다면 as 가 아닌 as? 를 사용하면 캐스팅 실패 시 null을 돌려준다.

}

