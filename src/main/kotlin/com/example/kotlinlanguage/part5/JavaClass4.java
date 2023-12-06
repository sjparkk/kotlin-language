package com.example.kotlinlanguage.part5;

public class JavaClass4 {

    public static void main(String[] args) {

        //object 키워드로 선언된 객체는 자바에서 일반적인 클래스로 인신되며, INSTANCE라는 이름의 static 필드를 자동으로 갖는다.
        System.out.println(KotlinObject.INSTANCE.getNum());

        //INSTANCE는 KotlinObject 타입의 필드이다. 이 INSTANCE 를 통해 객체의 프로퍼티와 멤버 함수에 접근할 수 있다.
        KotlinObject.INSTANCE.setNum(0);

        //INSTANCE 필드 없이 객체의 프로퍼티와 멤버 함수에 접근하려면 프로퍼티와 멤버 함수에 @JvmStatic 어노테이션을 붙여줘야 한다.
        KotlinObject.INSTANCE.hello();
    }
}
