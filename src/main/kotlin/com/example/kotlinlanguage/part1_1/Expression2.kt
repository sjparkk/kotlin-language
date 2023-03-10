package com.example.kotlinlanguage.part1_1


fun main(args: Array<String>): Unit {
    // 다음과 같은 코드는 자바에서는 오류 발생 -> 표현식이 단독으로 오는 것을 허용하지 않기 때문
    // 하지만 코틀린은 허용하므로 오류 발생하지 않음
    53 + 62 - 126

    // 다음과 같이 숫자 값 자체를 나타내는 부분을 '리터럴'이라함.
    // + , - 은 연산자
    // 계산을 수행하기 위한 재료가 되는 부분은 피연산자이고, 53은 리터럴이면서 피연산자가 됨
    53 + 62

    // 피연산자와 연산자로 이루어진 뭉치는 결국 하나의 값으로 수렴하게 되며 이렇게 하나의 값으로 수렴되는 수식 뭉치를 '표현식(Expression)'이라 한다.
    53 + 62 - 126

    //결과를 보기 위함
    println(53 + 62 - 126)

    //감싸면 텍스트로 인삭
    println("53 + 62 - 126")

}