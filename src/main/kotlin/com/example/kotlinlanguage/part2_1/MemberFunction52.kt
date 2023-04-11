package com.example.kotlinlanguage.part2_1

/**
 * 멤버 함수
 *
 * 클래스 안에 함수를 내장시키는 방법을 배운다.
 */
class Building {
    var name = "" //건물명
    var date = "" //건축일자
    var area = 0 // 면적

    //Building Class 내 print 함수 내장 -> 이렇게 클래스에 내장된 함수를 멤버 함수라고 부른다.
    //그리고 프로퍼티와 멤버 함수를 아울러 간단히 멤버라고 부른다.
    fun print() {
        //여기서 this는 멤버 함수가 호출될 때, 어떤 객체로부터 호출된 것인지를 나타내는 키워드이다.
        //즉, building.print()와 같이 멤버 함수를 호출하면, this 키워드는 building 참조 변수가 가리키는 객체로 치환된다.
        println("이름 : " + this.name)

        //this는 생략이 가능하므로 프로퍼티 이름만 써도 된다.
        println("건축일자 : " + this.date)
        println("면적 : " + this.area)
    }
}

fun printBuilding(building: Building) {
    println("이름 : " + building.name)
    println("건축일자 : " + building.date)
    println("면적 : " + building.area)
}

/**
 * 코틀린에 존재하는 모든 타입은 클래스이다. 죽, Byte, Short, Int, Long, Float, Double, Char, Boolean 같이 스택에 실제 값이 저장되는 타입들도 모두 클래스이다.
 * Int 클래스의 toDouble()이라는 멤버 함수를 이미 호출했었다.
 *
 * Int와 같이 클래스를 선언문을 확인해보면 프로퍼티는 없고, 여러 멤버 함수만 잔뜩 있다. (물론 멤버 함수 내용은 텅텅 비어 있다.)
 *
 * 기본 타입이 클래스로 선언된 것은, 기본 타입에서 호출할 수 있는 멤버 함수를 코틀린 문법적으로 확실히 하기 위한 장치일 뿐,
 * 그 자체로 어떤 코드를 담고 있는 것은 아니다. 즉, 기본 타입은 클래스의 형태는 하고 있어도 사용자 정의 클래스와는 엄연히 다르다. (여기서 사용자 정의 클래스란 , Person Car와 같이 우리가 임의로 정의한 클래스를 말함)
 */