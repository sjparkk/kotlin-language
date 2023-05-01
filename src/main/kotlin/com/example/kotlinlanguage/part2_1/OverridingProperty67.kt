package com.example.kotlinlanguage.part2_1

/**
 * 프로퍼티를 오버라이딩하기
 *
 * 프로퍼티도 오버라이딩이 가능함을 이해한다.
 * 프로퍼티에도 함수의 일종인 Getter/Setter가 존재하므로, 이들도 오버라이딩이 가능하다.
 */
open class AAAAA {

    open var number = 10
        get() {
            println("AAAAA number Getter 호출")
            return field
        }
        set(value) {
            println("AAAAA number Setter 호출")
            field = value
        }
}

// AAAAA 클래스를 상속받아 Overriding
class BBBB: AAAAA() {

    //프로퍼티도 함수와 마찬가지로 override 키워드를 붙여줌.
    override var number: Int
        get() {
          println("BBBB number Getter 호출")
          return super.number
        }
        set(value) {
            println("BBBB number Setter 호출")
            super.number = value
        }

    /**
     * 추가적으로 슈퍼클래스에서 val로 선언한 프로퍼티를 var로도 오버라이딩할 수 있다.
     */
}

fun main(args: Array<String>) {

    val test = BBBB()
    test.number = 5
    test.number

}