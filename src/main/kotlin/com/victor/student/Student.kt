package com.victor.student

fun main() {
    val stu = Student("Victor", 88, 100)
    stu.print()

}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" + (english + math) / 2)
    }
}