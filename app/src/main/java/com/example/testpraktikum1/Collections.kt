package com.example.testpraktikum1

//list adalah kumpulan data yang disusun secara berurutan
//list bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
//list bersidat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//list Read-Only menggunakan ListOf
//list Mutable menggunakan mutableListOf

fun ContohList() {
    println("== List ==")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B","C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

}