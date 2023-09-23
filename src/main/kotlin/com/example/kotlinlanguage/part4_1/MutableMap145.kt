package com.example.kotlinlanguage.part4_1

/**
 * MutableMap 인터페이스 살펴보기
 *
 * 수정이 가능한 Map인 MutableMap에 대해 알아본다.
 *
 * mutableMapOf 함수를 호출하면 MutableMap 타입의 객체가 반환된다.
 * MutableMap<K, V> 인터페이스는 Map<K, V>를 상속, MutableMap에서 추가 및 변경된 멤버는 다음과 같다.
 *
 * MutableEntry는 키와 값 한 쌍을 표현하는 중첩 인터페이스, 값을 변경할 수 있는 setValue함수가 추가 (반환 값은 이전에 갖고 있던 값)
 * interface MutableEntry<K, V>: Map.Entry<K, V> {
 *    fun setValue(newValue: V): V
 * }
 *
 * keys 프로퍼티는 MutableSet<K> 타입으로 오버라이딩
 * override val keys: MutableSet<K>
 *
 * values 프로퍼티는 MutableCollection<V> 타입으로 오버라이딩
 * override val values: MutableCollection<V>
 *
 * entries 프로퍼티는 MutableSet<MutalbleMap.MutableEntry<K, V>>으로 오버라이딩
 * override val entries: MutableSet<MutalbleMap.MutableEntry<K, V>>
 *
 * put은 MutableMap에 키와 값 한 쌍을 추가하고 null을 반환, 만약 동일 키가 있다면 그 키와 연관되어 있는 값을 교체만하고 이전에 갖고 있던 값 반환
 * abstract fun put(key: K, value: V): V?
 *
 * key와 연관된 값 삭제
 * abstract fun remove(key: K): V?
 *
 * key와 value 모두 일치하는 쌍을 삭제 -> 있으면 삭제 후 true 반환
 * abstract fun remove(key: K, value: V): Boolean
 *
 * from에 있는 모든 키와 값 쌍을 추가, 키가 존재한다면 값만 변경
 * abstract fun putAll(from: Map<out K, V>): Unit
 *
 * 모든 키와 값 쌍을 삭제
 * abstract fun clear(): Unit
 *
 * set은 MutableMap을 map[key] = value 형태로 쓸 수 있게 해준다.
 * inline operator fun <K, V> MutableMap<K, V>.set(key: K, value: V): Unit {
 *      put(key, value)
 * }
 */
fun main(args: Array<String>) {

    val map: MutableMap<String, String> = mutableMapOf()
    println(map) // {}

    println(map.put("Hi", "안녕")) // null
    println(map) // {Hi=안녕}

    println(map.put("Hi", "안녕하세요")) // 이전에 가지고 있던 값 '안녕'이 출
    println(map) // {Hi=안녕하세요}

    map["Hi"] = "안녕히"
    println(map) //{Hi=안녕히}

    map.putAll(mapOf("How is it going?" to "잘 지내?", "Bye!" to "잘 가!"))
    println(map) // {Hi=안녕히, How is it going?=잘 지내?, Bye!=잘 가!}

    println(map.remove("Hi")) // 삭제 된 값 -> '안녕히' 출력
    println(map) // {How is it going?=잘 지내?, Bye!=잘 가!}

    println(map.remove("Bye!", "잘")) // false
    println(map) // {How is it going?=잘 지내?, Bye!=잘 가!}

    println(map.remove("Bye!", "잘 가!")) // 존재하므로 true
    println(map) // {How is it going?=잘 지내?}

    map.clear()
    println(map) // {}
}