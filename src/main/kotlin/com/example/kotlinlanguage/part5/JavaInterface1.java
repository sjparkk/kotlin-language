package com.example.kotlinlanguage.part5;

public interface JavaInterface1 {
    //자바에서 이 매개변수로는 절대 null 값이 들어오지 않는다는 것을 보장하고 싶으면 매개 변수 타입에 @NotNull 어노테이션을 붙이면 된다.
    //@NotNull이 붙은 String 타입은 코틀린에서 느낌표 없이 String 그대로 인식된다. (반대는 @Nullable)
    String trim(String str);
}
