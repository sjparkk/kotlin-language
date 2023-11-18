package com.example.kotlinlanguage.part4_2

import java.io.File

/**
 * FileTreeWalk 클래스 : 디렉토리 순회하기
 *
 * 쉽게 특정 디렉토리의 하위 파일 및 하위 디렉토리를 순회하는 방법을 알아본다.
 * FileTreeWalk 클래스는 Sequence<File>을 구현하는 클래스이며, 반복자를 이용해 특정 디렉토리의 하위 파일과 하위 디렉토리들을 순회할 수 있다.
 */
fun main(args: Array<String>) {

    //현재 디렉토리의 File 인스턴스 생성
    val fileTree: FileTreeWalk = File("./").walk() // walk 확장 함수로부터 FileTreeWalk 인스턴스 얻으며, FileWalkDirection는 파일 순회 방향을 나타내는 열거 클래스
        .maxDepth(3) // 탐색할 하위 디렉토리의 최대 깊이를 지정 -> 해당 멤버 함수를 호출하지 않으면 최하위 디렉토리가 나올 때까지 계속 순회
        .onEnter { file -> // 새로운 디렉토리로 들어왔을 때 호출 될 함수를 지정하는 FileTreeWalk의 멤버 함수
            println("새 디렉토리 방문 : ${file.name}")
            true
        }

    for(file in fileTree)
        println(file.name)
}