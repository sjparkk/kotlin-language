package com.example.kotlinlanguage.part3_1

/**
 * 동반자 객체
 *
 * 클래스에 객체를 내장하는 방법을 알아본다.
 */
//create() 멤버 함수를 통해서만 Person1객체를 생성할 수 있도록 하기 위해 생성자의 접근지정자를 private 지정
class Person1 private constructor() {

    //해당 부분이 동반자 객체를 정의하는 부분 -> 동반자 객체를 정의할 때는 이름 없이 companion object 라고만 적는다.
    companion object {

        //Person1의 인스턴스를 생성하는 멤버 함수이다.
        fun create(): Person1 {
            //인스턴스를 반환하면서 지금까지 생성한 인스턴스의 개수를 카운트
            countCreated += 1
            return Person1()
        }

        //생성된 인스턴스를 집계하기 위한 프로퍼티
        var countCreated = 0
            private set // 외부에서 함부로 값을 조작하는 것을 방지하기 위해 Setter의 접근 지정자를 private로 설정
    }
}

fun main(args: Array<String>) {

    /**
     * 어떤 클래스 안에 동반자 객체를 정의해놓으면 Companion이라는 식별자가 자동으로 생긴다. 따라서 Person1.create()는 Person1.Companion.create()로도 호출이 가능하다.
     */
    val a = Person1.create()
    val b = Person1.create()

    //출력 2
    println(Person1.countCreated)

    /**
     * 코틀린에는 static 키워드가 더 이상 존재하지 않는다. 따라서 static의 효과를 얻고 싶으면 동반자 객체를 사용해야 한다.
     */
}