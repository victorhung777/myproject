package com.victor

//Tip: main <tab>
fun main() {
    // tailing with ; or not is fine in Kotlin
    println("Hello Kotlin 1")
    println("Hello Kotlin 2");
    Human().hello()
    val h = Human()  // What does val stand for?
    h.hello()

    // There's no basic data type
    // var or val
    val age = 19
    val age_2: Int = 20

    var weight = 66.5
    var weight_2 = 66.5
    var name : String
    name = "Hank"

}
// control + V to pop up the VCS window

class Human {
    fun hello() {
        println("Hello Kotlin 3")
    }
}



