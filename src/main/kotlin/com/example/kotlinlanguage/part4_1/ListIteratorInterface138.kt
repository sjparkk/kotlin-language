package com.example.kotlinlanguage.part4_1

/**
 * List Iterator 인터페이스 살펴보기
 *
 * List에 특화된 Iterator 인 ListIterator 인터페이스의 멤버를 살펴본다.
 *
 * ListIterator<T> 인터페이스는 Iterator<T> 인터페이스를 구현한다. Iterator<T>의 멤버 외에 추가로 갖는 IstIterator<T>의 멤버는 다음과 같다.
 * abstract fun hasPrevious(): Boolean
 * 해당 멤버함수는 이전 원소가 존재하는지 여부를 반환
 *
 * abstract fun previous(): T
 * 해당 멤버함수는 이전 원소를 반환하고 ListIterator의 커서를 뒤로 한 칸 옮긴다.
 *
 * abstract fun nextIndex(): Int
 * 해당 멤버 함수는 다음 원소의 인덱스를 반환한다. 커서를 옮기지는 않음
 *
 * abstract fun previousIndex(): Int
 * 해당 멤버 함수는 이전 원소의 인덱스를 반환하고 커서를 옮기지는 않음
 */


private fun moveToNext(iter: ListIterator<Int>) {

    print("${iter.hasPrevious()}, ")
    print("${iter.hasNext()}, ")
    print("${iter.previousIndex()}, ")
    print("${iter.nextIndex()}, ")
    println("${iter.next()}")
}


fun main(args: Array<String>) {

    val iter: ListIterator<Int> = listOf(10, 20 , 30).listIterator()

    /**
    false, true, -1, 0, 10
    true, true, 0, 1, 20
    true, true, 1, 2, 30
     */
    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}
