package com.example.kotlinlanguage.part2_1

/**
 * 매모리의 힙 영역
 *
 * 객체가 만들어지는 공간인 힙 영역에 대해 알아본다.
 *
 */
fun main(args: Array<String>) {

    val personName = "홍길동"
    val personAge = 36

    //person 변수를 선언과 동시에 객체로 초기화하고 있다.
    //1. 이때 변수의 선언이 먼저 이루어지므로, 처음에는 스택에 person 변수가 쌓인다.
    val person = object {
        //2. 그 다음 object {...} 부분이 실행되어 힙 영역에 객체가 생성된다. (변수가 차곡차곡 쌓이는 형태인 스택 영역과는 달리, 힙 영역에는 임의의 위치에 객체가 생성된다.)
        //그러므로 어떤 객체의 프로퍼티에 값을 저장하거나 저장된 값을 가져오고 싶으면 그 객체의 힙 영역상 좌표를 알고 있어야 한다.
        val name: String = "홍길동"
        val age: Int = 36
    }

    //3. person 변수에는 객체의 좌표를 저장하기 위한 공간만 존재하고, 이러한 변수를 참조 변수라고 한다.
    println(person.name)
    println(person.age)

}