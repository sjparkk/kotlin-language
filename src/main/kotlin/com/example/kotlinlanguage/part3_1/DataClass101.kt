package com.example.kotlinlanguage.part3_1

/**
 * 데이터 클래스
 *
 * 데이터에 특화된 클래스를 선언하는 방법을 배운다.
 *
 * 클래스에는 크게 데이터 자체의 역할만 하는 클래스와 데이터를 다루는 역할을 하는 클래스가 있다.
 * 예를 들어 사원 데이터 자체만 속성으로 갖고 있는 Employee 클래스와, Employee의 인스턴스들을 관리하는 EmployeeManager 클래스 같은 식으로 말이다.
 * 코틀린은 데이터에 특화된 클래스를 선언할 수 있는 문법을 제공한다.
 */

//데이터 클래스를 선언하기 위해서는 클래스 선언문 앞에 data 키워드를 붙인다.
data class Employee1(
    val name: String,
    val age: Int,
    val salary: Int
)

/**
 * 데이터 클래스의 이점
 *
 * 1. Any 클래스에 들어있는 equals, hashCode, toString 멤버 함수가 자동으로 오버라이딩
 * 2. equals 멤버 함수는 각 프로퍼티의 값이 서로 모두 같으면 true, 하나라도 다르면 false를 반환하게 오버라이딩 된다
 * 3. toString 멤버 함수는 "Employee(name=..., age=..., salary = ...)" 형태로 문자열을 반환하도록 오버라이딩 된다
 * 4. 객체를 복사하는 copy() 함수가 자동으로 선언된다.
 *
 * 주의점
 * - copy의 경우 똑같은 멤버 함수를 데이터 클래스의 선언하면 충돌 오류가 발생하지만 equals, hashCode, toString 멤버함수는 직접 선언하면 직접 선언한 멤버함수로 오버라이딩된다.
 *
 * 데이터 클래스를 사용하기 위한 규칙
 * 1. 적어도 하나의 프로퍼티를 가져야 한다.
 * 2. 생성자 매개변수에는 반드시 var이나 val을 같이 써야 한다. 즉, 프로퍼티의 대응하지 않는 생성자 매개변수를 가질 수 없다.
 * 3. abstract, open, sealed, inner 키워드를 붙일 수 없다.
 * 4. 인터페이스만 구현할 수 있다. (단 코틀린 1.1 버전부터는 sealed 클래스도 상속 가능)
 * 5. component1, component2, ...와 같은 이름으로 멤버 함수를 선언할 수 없다. (컴파일러가 내부적으로 사용하는 이름이기 때문)
 */

fun main(args: Array<String>) {
    //Employee1의 인스턴스를 생성
    val first = Employee1("John", 30, 3000)
    val second = Employee1("Page", 24, 5300)

    //data 키워드 덕에 자동으로 선언된 copy 멤버 함수를 호출 -> 각 프로퍼티의 값을 그대로 복사한 새 인스턴스를 반환
    val third = first.copy()

    println(first.toString())
    println(third.toString())

    //first와 second는 서로 프로퍼티의 값이 다르므로 false
    println(first == second)

    //프로퍼티의 값이 서로 모두 같으므로 true
    println(first == third)

}
