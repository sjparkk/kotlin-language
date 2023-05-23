package com.example.kotlinlanguage.part2_2

/**
 * 접근 지정자 오버라이딩
 *
 * 오버라이딩을 하면서 접근 지정자를 변경할 수 있음을 이해한다.
 */
class AccessModifierOverriding85 {

    //오버라이딩이 가능하게끔 number 프로퍼티에 open 키워드
    open class AAA(protected open val number: Int) {
        //오버라이딩이 가능하게끔 hello 함수에도 open 키워드
        protected open fun hello() {
            println("hello")
        }
    }

    class BBB(number: Int): AAA(number) {
        public override val number: Int
            get() = super.number

        public override fun hello() {
            super.hello()
        }
    }

    fun main(args: Array<String>) {
        val b = BBB(26)
        val a: AAA = b

        //Cannot access 'number': it is protected in 'AAA'
        //a는 AAA 타입이므로 protected인 number에 접근하면 오류 발생
//        println(a.number)

        //Cannot access 'hello': it is protected in 'AAA'
//        a.hello()

        //오버라이딩 되어 접근 가능
        println(b.number)
        b.hello()
    }
}

