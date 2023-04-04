package com.example.kotlinlanguage.part2_1

/**
 * 클래스(Class)
 *
 * 객체를 찍어내는 틀인 클래스에 대해 알아본다.
 */
class Class47 {

    //만약 똑같은 형태의 객체를 여러 개 만들고 싶을 때 앞서 배운 대로라면 다음과 같이 해야 한다.
    //그러나 이 방법은 반복적이고 번거롭다.
    val person = object {
        val name: String = "홍길동"
        val age: Int = 36
    }

    val person2 = object {
        val name: String = "김미영"
        val age: Int = 29
    }

    val person3 = object {
        val name: String = "John"
        val age: Int = 52
    }

    //그래서 클래스라는 문법을 이용하면 모양이 같은 객체를 대량 생산할 수 있다.
    class Person {
        var name: String = ""
        var age: Int = 0
    }

    /**
     * class 클래스 이름 {
     *  프로퍼티
     * }
     */
    fun main(args: Array<String>) {
        val person: Person

        // 객체를 생성할 때 사용하는 new 키워드는 코틀린에서는 삭제되었다. new 없이 다음과 같이 생성자만 호출하면 된다.
        // 클래스로부터 생성된 객체는 특별히 인스턴스라고 부른다.
        person = Person()
        person.name = "홍길동"
        person.age = 36

        val person2 = Person()
        person2.name = "김미영"
        person2.age = 29

        val person3 = Person()
        person3.age = 52
        person3.name = "John"
    }

    /**
     * 추가적으로 자바에서 public 클래스를 선언하려면 클래스 이름이 파일 이름과 같아야 하고, public 클래스는 파일 하나당 한 개만 존재할 수 있지만,
     * 코틀린에서는 클래스 이름이 파일 이름과 같아야 할 의무가 없으며, 한 파일 내에 여러 개의 public 클래스를 선언할 수도 있다.
     *
     * 코틀린의 기본 접근지정자는, 기본값이 default인 자바와는 달리 public이다. 정보 은닉을 중시하는 객체지향 관점에서 보면 조금 의아한 부분이 있지만
     * 자바의 수많은 클래스와 메서드들이 public으로 선언되어 있다는 점 때문에 간결한 코드를 중시하는 코틀린에서는 public으로 정했다고 한다.
     */

}