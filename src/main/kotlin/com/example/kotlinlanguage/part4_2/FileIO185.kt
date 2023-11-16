package com.example.kotlinlanguage.part4_2

//자바 표준 라이브러리에 선언된 클래스들 import
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
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

    //exists 파일의 존재 여부를 반환
    if(!file.exists())
        file.createNewFile() // 존재하지 않을 시 createNewFile 멤버 함수를 호출하여 파일을 생성

    //OutputStream은 어떤 장치로 데이터를 출력하기 위한 기본적인 멤버를 갖는 자바의 클래스
    val outputStream: OutputStream = file.outputStream()// FileOutputStream은 File 클래스에 선언된 멤버 함수가 아닌 코틀린 표준 라이브러리의 확장함수
    outputStream.write(35)

    //OutputStreamWriter 클래스는 바이너리 형태로 데이터를 출력하는 멤버만 갖고 있다.
    val osw: OutputStreamWriter = outputStream.writer() // writer 내 Charset은 출력할 텍스트의 문자셋을 나타내며, 기본값은 Charsets.UTF_8이다.
    osw.write("파일 입출력")
    osw.close()

    //InputStream은 어떤 장치로 부터 데이터를 읽어오기 위한 기본적인 멤버를 갖는 자바의 클래스이다.
    val inputStream: InputStream = file.inputStream() // file.inputStream()은 File클래스에 선언된 멤버 함수가 아닌 코틀린 표준 라이브러리의 확장 함수
    println(inputStream.read())

    //InputStreamReader 클래스는 텍스트 형태로 데이터를 출력하는 멤버만 갖고 있다.
    val isr: InputStreamReader = inputStream.reader()
    println(isr.readText()) // readText()는 파일에 남아 있는 데이터를 모두 텍스트 형태로 읽어들인 뒤 반환한다.
    isr.close() // 출력과 마찬가지로 작업이 끝났으면 InputStream이나 InputStreamReader의 close 멤버 함수를 호출하여 파일을 닫아주어야 한다.


}