package com.example.testpraktikum1

// data class
// data class adalah class yang digunakan untuk menyimpan data
// data class menyediakan fungsi untuk meng-override fungsi aquals(), hashCode(), dan toString()
// data class juga menyediakan fungsi copy() untuk membuat objek dengan beberapa perubahan

data class DataClass(
    val id : Int,
    val email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    // fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) //false

    // fungsi copy
    val data3 = data.copy()
    println(data3)

    // fungsi copy dengan perubahan
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)

}