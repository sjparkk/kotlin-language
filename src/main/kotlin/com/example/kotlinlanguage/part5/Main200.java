package com.example.kotlinlanguage.part5;

public class Main200 {

    public static void main(String[] args) {

        //동반자 객체가 있는 클래스는 자바에서 Companion이라는 이름의 static 필드를 갖는다.
        KotlinClass1.Companion.setNum(30);

        //이 Companion 필드로 동반자 객체에 접근할 수 있다.
        System.out.println(KotlinClass1.Companion.getNum());

        //동반자 객체도 선언된 객체와 마찬가지로 각 멤버에 @JvmStatic 어노테이션을 붙여 static으로 접근하게 할 수 있다.
        KotlinClass1.Companion.hello();
    }
}
