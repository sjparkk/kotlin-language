package com.example.kotlinlanguage.part5;

public class MainClass {

    public static void main(String[] args) {
        System.out.println(KotlinToJavaPackageLevel197Kt.getA());
        KotlinToJavaPackageLevel197Kt.func(); // Hello가 출력
        KotlinToJavaPackageLevel197Kt.extension(100); // 확장함수도 사실 파일명kt 클래스의 static 멤버이다.
    }
}
