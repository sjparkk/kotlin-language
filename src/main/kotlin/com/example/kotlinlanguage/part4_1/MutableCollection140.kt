package com.example.kotlinlanguage.part4_1

/**
 * 변경할 수 있는(Mutable) 컬렉션
 *
 * 컬렉션에 값을 추가하거나 삭제하는 방법을 알아본다.
 *
 * 컬렉션 인터페이스는 컬렉션의 원소를 수정할 수 있는 방법을 제공하지 않는다.
 * 컬렉션의 원소를 수정하려면 MutableCollection 인터페이스를 구현하는 컬렉션을 이용해야 한다.
 *
 * 자바와는 달리, 코틀린의 컬렉션은 기본적으로 수정이 불가능(Unmodifilable)하다. 덕분에 쓰레드 세이프한 코드를 만들 수 있게 되었다.
 *
 * MutableCollection은 다음과 같이 선언되어 있다.
 * interface MutableCollection<E>: Collection<E>, MutableIterable<E>
 *
 * MutableIterable 인터페이스는 다음과 같이 선언되어 있다. Iterable인터페이스에 선언된 iterator 멤버 함수를 오버라이딩하여 반환 타입을 바꿔준다.
 * interface MutableIterable<out T>: Iterabble<T> {
 *  override fun iterator(): MutableIterator<T>
 * }
 *
 * MutableIterable<E> 인터페이스는 다음과 같이 멤버를 갖고 있다.
 *
 * abstract fun add(element: E): Boolean
 * 컬렉션에 원소를 추가, 성공적으로 추가되면 true 원소의 중복을 허용하지 않는다는 등의 이유로 추가하지 못한다면 false
 *
 * abstract fun addAll(elements: Collection<E>): Boolean
 * 모든 원소를 컬렉션에 추가, 하나라도 추가되었다면 true
 *
 * abstract fun remove(element: E): Boolean
 * element와 일치하는 원소를 하나 제거, 제거되었다면 true, 해당 원소가 없다면 false
 *
 * abstract fun removeAll(elements: Collection<E>): Boolean
 * 일치하는 모든 원소를 컬렉션에서 제거, 하나라도 제거되면 true
 *
 * abstract fun retainAll(elements: Collection<E>): Boolean
 * elements에 일치하는 원소만 남기고 컬렉션에서 모두 제거, 하나라도 제거되면 true
 *
 * abstract fun clear()
 * 모든 원소 삭제
 */

fun main(args: Array<String>) {

    val mutableList: MutableCollection<Int> = mutableListOf(1,2,4,2,3,2,5)
    println(mutableList) // [1, 2, 4, 2, 3, 2, 5]

    mutableList.add(1)
    println(mutableList) // [1, 2, 4, 2, 3, 2, 5, 1]

    mutableList.addAll(listOf(3,2,4))
    println(mutableList) //[1, 2, 4, 2, 3, 2, 5, 1, 3, 2, 4]

    mutableList.remove(1)
    println(mutableList) // [2, 4, 2, 3, 2, 5, 1, 3, 2, 4]

    mutableList.removeAll(listOf(1,2))
    println(mutableList) // [4, 3, 5, 3, 4]

    mutableList.retainAll(listOf(3,5))
    println(mutableList) // [3, 5, 3]

    mutableList.clear()
    println(mutableList) // []

    /**
     컬렉션을 반드시 수정해야 하는 상황이 아니라면 Mutable이 아닌 일반 Collection을 쓰자.
     이유는 변수 선언 시 var 대신 val 을 권장하는 이유와 같다.
     컬렉션을 수정할 수 있다면 컬렉션에 들어 있는 원소와 관련된 버그가 발생했을 때 컬렉션을 어느 지점에서 수정하는지 일일이 찾아봐야 하기 때문이다.
     */
}