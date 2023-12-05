package com.example.kotlinlanguage.part5

class KotlinClazz {

    //@JvmFiled 를 붙이면 Getter/Setter가 아닌 필드 형탤오 접근이 가능하다.
    //kotlin.num 과 같이 접근이 가능하다는 것, 하지만 해당 어노테이션을 붙이기 위해서는 프로퍼티가 private가 아니여야 하고 프로퍼티에 open, override const 키워드를 붙일 수 없으며, 위임된 프로퍼티가 아니어야 한다.
    var num: Int = 0
}