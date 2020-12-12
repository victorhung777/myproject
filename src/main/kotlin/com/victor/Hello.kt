package com.victor

//Tip: main <tab>
fun main() {
    // tailing with ; or not is fine in Kotlin
    println("Hello Kotlin 1")
    println("Hello Kotlin 2");
    Human().hello()
    val h = Human()  // What does val stand for?
    h.hello()
}

class Human {
    fun hello() {
        println("Hello Kotlin 3")
    }
}



