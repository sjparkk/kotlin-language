package com.example.kotlinlanguage.part2_1

/**
 * 프로퍼티와 Getter/Setter
 *
 * 프로퍼티에 Getter, Setter 라고 부르는 특수 함수가 포함되어 있음을 이해한다.
 */
class Person1 {

    var age: Int = 0
        get() {
            return field
        }
        //value의 타입을 어차피 프로퍼티 타입과 같기 때문에 생략이 가능하다.
        set(value) {
            field = if (value >= 0) value else 0
        }
}

fun main(args: Array<String>) {
    val person = Person1()
    //person 객체의 age 프로퍼티에 값을 저장하고 있다.
    //이렇게 프로퍼티에 특정 값을 대입하면, 이 프로퍼티에 해당하는 setter가 호출된다.
    person.age = -30

    //프로퍼티의 저장된 값을 읽어오기 위해 getter가 호출된다.
    println(person.age)

    // 프로퍼티는 실제로 데이터가 저장되는 공간(Field), 저장된 값을 읽으려고 할 때 getter, 그리고 값을 저장하려고 할 때 Setter로 이루어져 있다.

}