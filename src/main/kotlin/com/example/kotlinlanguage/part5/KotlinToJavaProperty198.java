package com.example.kotlinlanguage.part5;

/**
 * 자바에서 코틀린 코드 접근하기 : 프로퍼티
 *
 * 자바에서 코틀린 프로퍼티에 접근하는 방법을 알아본다.
 */
public class KotlinToJavaProperty198 {
    public static void main(String[] args) {

        KotlinClazz kotlin = new KotlinClazz();
        kotlin.setNum(16); // getNum, setNum 메서드로 프로퍼티에 접근
        System.out.println(kotlin.getNum());
    }
}
