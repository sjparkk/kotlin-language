package com.example.kotlinlanguage.part5;

public class JavaClass3 {

    public static <T> void printClassInfo(Class<T> clazz) {
        System.out.println(clazz.getCanonicalName());
    }
}
