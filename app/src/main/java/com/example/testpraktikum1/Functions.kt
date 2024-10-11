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

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "Jhon", age = 30)
    withDefaultParameter(age = 25)
}
