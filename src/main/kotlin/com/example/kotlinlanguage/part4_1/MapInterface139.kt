package com.example.kotlinlanguage.part4_1

/**
 * Map 인터페이스 살펴보기
 *
 * Map 인터페이스는 아래와 같은 멤버를 갖는다
 * interface Map<K, out V>
 *
 * Entry는 키와 값 한쌍을 표현하는 중첩 인터페이스이다
 * interface Entry<out K, out V>
 *
 * size는 Map에 들어있는 키와 값 쌍의 개수를 갖는 프로퍼티
 * abstract val size: Int
 *
 * keys는 Map의 키들만 갖는 프로퍼티 (Map의 키는 중복되지 않기 때문에 Set 타입으로 되어 있다.)
 * abstract val keys: Set<K>
 *
 * values는 Map의 값들만 갖는 프로퍼티이다. Map의 값은 중복될 수 있기 때문에 Collection 타입으로 되어 있다.
 * abstract val values: Collection<V>
 *
 * entries는 Map에 들어있는 모든 키와 값 쌍들을 갖는 프로퍼티이다.
 * abstract val entries: Set<Map.Entry<K, V>>
 *
 * isEmpty 멤버 함수는 Map이 비어있는지 여부를 반환한다.
 * abstract fun isEmpty(): Boolean
 *
 * containsKey 멤버 함수는 Map에 key에 해당하는 키가 들어 있는지 여부를 반환
 * abstract fun containsKey(key: K): Boolean
 *
 * abstract fun containsValue(value: V): Boolean
 * containsValue 멤버함수는 Map에 value에 해당하는 값이 들어 있는지 여부를 반환
 *
 * abstract operator fun get(key: K): V? (get은 Map 타입에 []연산자를 사용할 수 있도록 하는 역할도 한다)
 * get은 key에 해당하는 값을 반환하는 연산자 멤버 함수, 없다면 null 반환
 *
 * open fun getOrDefault(key: K, defaultValue: V): V
 * 키를 반환하되 해당하는 값이 없으면 defaultValue을 반환
 */

fun main(args: Array<String>) {

    val map: Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    /**
    2
    [Apple, Banana]
    [사과, 바나나]
    [Apple=사과, Banana=바나나]
    false
    false
    true
    사과
    코코아
     */
    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map.containsValue("바나나"))
    println(map["Apple"])
    println(map.getOrDefault("Cocoa", "코코아"))

}