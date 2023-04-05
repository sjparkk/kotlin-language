package com.example.kotlinlanguage.part2_1

/**
 * 힙 영역의 존재 이유
 *
 * 객체는 왜 스택이 아닌 힙 영역에 생성될까?
 * 굳이 스택 영역과 힙 영역을 나눠 놓은 이유를 알아본다.
 */
class Product {
    var name = ""
    var price = 0
}

fun main(args:Array<String>) {
    val product: Product

    //Product 타입의 값을 반환하는 함수를 호출하고, 그 결과를 product 참조 변수에 저장하고 있다.
    //1. 먼저 변수의 선인이 이루어지므로 스택영역에 product가 생기게 된다.
    //4. 가장 중요한 부분! -> 일단 apple 참조 변수는 createProduct 함수가 끝났으므로 스택에서 지워진다. 하지만 apple 참조변수가 가리키고 있던 객체는 힙에서 지워지지 않는다. (힙영역에 저장된 apple 객체 정보)
    //-> 추가적으로, 힙 영역에 생성한 변수는 어느 블록에서 생성했던 간에, 블록을 빠져나와도 지워지지 않는다.
    //5. 이후 apple이 가지고 있던 참조값이 product에 저장된다.
    product = createProduct()

    //6.printProductInfo함수로 product의 참조값을 전달한다. -> 이때 main 함수의 product와 printProductInfo 함수의 product 즉, 두개의 product 참조 변수가 하나의 객체를 가리키게 된다.
    // 만약 힙이라는 공간이 없었다면 각각 자신만의 name과 price 변수를 가지고 있었어야 하지만 힙 영역을 통해 메모리 공간을 절약할 수 있게 된다.
    printProductInfo(product)
    processProduct(product)
    printProductInfo(product)
}

//2. 이후 createProduct 함수 안으로 실행 흐름이 이동한다.
fun createProduct():Product {
    //3. Product의 인스턴스를 생성하고, apple 참조변수에 그 위치를 저장한다. 이때 apple도 스택 영역에 생기게 된다.
    val apple = Product()
    apple.name = "Apple"
    apple.price = 1000
    return apple
}

fun processProduct(product:Product) {
    product.price += 500
}

fun printProductInfo(product: Product) {
    println("이름: ${product.name}")
    println("가격:${product.price}")
}