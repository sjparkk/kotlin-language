package com.example.kotlinlanguage.part3_2

/**
 * In/Out 키워드
 *
 * 타입 매개변수에 붙일 수 있는 In/out 키워드와 이들의 효과에 대해서 알아본다.
 */

/**
class AAA<T>
...
val a = AAA<Int>()
val b: AAA<Any> = a

다음과 같이 코드는 사용이 불가능하다.
 Int는 Any 티입을 상속하니 업캐스팅을 이용하여 AAA<Any> 타입에 AAA<Int>타입의 값을 넣을 수 있을 거 같지만 불가능하다.
 Int타입이 Any의 서브 타입이라고 해서 AAA<Int> 가  AAA<Any> 의 서브 타입인 것은 아니기 때문
*/

class DDD<out T>

class FFF<in T>

fun main(args: Array<String>) {

    //out 키워드를 이용하면 DDD<서브 타입>을 DDD<슈퍼 타입> 에 대입할 수 있게 된다.
    val dddSub = DDD<Int>()
    val dddSuper: DDD<Any> = dddSub

    //in 키워드를 이용하면 슈퍼타입을 서브 타입에 대입 할 수 있다
    val fffSuper = FFF<Any>()
    val fffSub: FFF<Int> = fffSuper

    val star: DDD<*> = dddSub

    //in T는 자바의 ? super T 와 같다.
    //타입 인수로 *를 지정하면, 타입 인수가 무엇이든 상관없이 DDD 타입을 대입할 수 있다.
    //즉, DDD<Any>든, DDD<Int>든, 상관없이 변수에 대입이 가능하다.

}
