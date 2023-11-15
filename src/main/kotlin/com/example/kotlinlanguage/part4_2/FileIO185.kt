package com.example.kotlinlanguage.part4_2

//자바 표준 라이브러리에 선언된 클래스들 import
import java.io.File
import java.io.OutputStream
import java.io.OutputStreamWriter

/**
 * 파일 입출력
 *
 * 코틀린에서 파일 입출력을 하는 방법을 알아본다.
 *
 * 코틀린의 파일 입출력은 근복적으로 자바 표준 라이브러리에 의존하며,
 * 코틀린 확장 함수가 이를 보조하는 형태로 되어 있다. 따라서 코틀린에서 파일 입출력을 하면 JVM에 의존성이 생긴다.
 */
fun main(args: Array<String>) {

    //File은 특정 파일을 표현하는 자바 클래스이다.
    val file = File("./hello.txt")

    if(!file.exists())
        file.createNewFile()

    val outputStream: OutputStream = file.outputStream()
    outputStream.write(35)

    val osw: OutputStreamWriter = outputStream.writer()
    osw.write("파일 입출력")
    osw.close()


}