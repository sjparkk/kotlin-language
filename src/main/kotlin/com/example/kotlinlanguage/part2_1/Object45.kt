package com.example.kotlinlanguage.part2_1

/**
 * Object 객체
 *
 * 서로 관련 있는 변수를 하나로 묶는 방법을 배운다.
 *
 * 객체란, 장바구니, 상자, 사람 등, 우리가 인식할 수 있는 물체 또는 물건을 뜻한다.
 * 객체들은 각자의 고유한 속성과 동작을 갖고 있다.
 *
 * 예를 들어 가방은 '용량'과 '색상'이라는 속성, 그리고 '담는다'라는 동작을 가질 수 있다.
 * 소프트웨어 관점에서 객체란, 서로 연관 있는 변수(속성)들을 묶어놓은 데이터 덩어리를 뜻한다.
 */
fun main(args: Array<String>) {

    //만약 사람에 대한 정보를 저장해야 되는데 객체라는 개념이 없다면 다음과 같이 변수를 선언해야 된다.
    //이렇게 하면 person 부분이 겹쳐서 코드가 중복되는 문제가 있다.
    val personName = "홍길동"
    val personAge = 36

    //object 키워드를 이용하여 다음과 같이 사용이 가능하다.
    //person 이라는 변수에 object를 저장하고 있고 객체에는 타임 이름이 없기 때문에 person의 타입을 생략하고 선언과 동시에 object {}로 초기화
    val person = object { // object의 시작과 끝을 나타내는 중괄호, 이 사이에 object(객체)에 포함시킬 변수들을 선언

        //name과 age 처럼 object에 포함된 변수들은 프로퍼티(property)라고 부른다.
        val name: String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)

    //추가적으로, 코틀린의 프로퍼티는 언뜻보면 자바의 필드와 동일하다.
    //그럼에도 왜 코틀린에서는 필드라는 용어 대신 프로퍼티라는 용어를 사용했을까?
    //이유는 사실 프로퍼티는 필드와 같지 않기 때문 => 프로퍼티는 필드와 Getter, Setter 가 합쳐진 개념이다.
}