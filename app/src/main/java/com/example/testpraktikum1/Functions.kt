package com.example.testpraktikum1

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//name argument
//name argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNAmedArgument ==")
    println("Hello, $name! You are $age years old.")
}