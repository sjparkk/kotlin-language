package com.example.kotlinlanguage.part2_1

/**
 * 보조 생성자
 *
 * 여러 개의 생성자를 정의하는 방법을 배운다.
 */
//생성자는 여러 개를 둘 수 있고, 기본적인 문법은 다음과 같다.
//주 생성자 (class 옆에 오는 생성자는 주 생성자)
/**
class 클래스 이름 constructor(매개변수) {

    //보조 생성자 1 (class 내부에 오는 생성자는 보조 생성자)
    constructor(매개변수): this(인수) {

    }

    //보조 생성자 2 (여러개 가능)
    constructor(매개변수): this(인수) {

    }
}
*/

class Time(val second: Int) {

    init {
        println("init 블록 실행 중")
    }


    //보조생성자1 -> 분과 초로 Time의 인스턴스를 초기화할 수 있는 보조 생성자
    //만약 클래스에 주 생성자가 존재한다면, 주 생성자를 반드시 먼저 호출해주어야 한다. this(인수)는 이 클래스에 포함된 또 다른 생성자를 호출하는 문법이다.
    constructor(minute: Int, second: Int) : this(minute * 60 + second) {
        println("보조 생성자 1 실행 중")
    }

    //보조생성자2 -> 분과 초로 Time의 인스턴스를 초기화할 수 있는 보조 생성자
    constructor(hour: Int, minute: Int, second: Int): this(hour * 60 + minute, second) {
        println("보조생성자2실행중")
    }

    init {
        println("또다른init블록실행중")
    }
}

fun main(args: Array<String>) {
    println("${Time(15, 6).second} 초 ")
    println("${Time(6, 3, 17).second} 초")
 }

/**
 출력 결과

 호출은 보조 생성자만 사용하였지만, 주 생성자가 존재하므로  'init 블록 실행 중', '또다른init블록실행중' 가 찍히는 것으로 주 생성자가 호출되는 것을 확인할 수 있음
 init 블록 실행 중
 또다른init블록실행중
 보조 생성자 1 실행 중
 906 초
 init 블록 실행 중
 또다른init블록실행중
 보조 생성자 1 실행 중
 보조생성자2실행중
 21797 초
 */