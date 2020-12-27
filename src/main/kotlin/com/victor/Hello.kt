package com.victor

//Tip: main <tab>
fun main() {
    // tailing with ; or not is fine in Kotlin
    println("Hello Kotlin 1")
    println("Hello Kotlin 2");
    Human().hello()
    val h = Human()  // What does val stand for?
    h.hello()

    val h3 = HumanVer3(81.2f, 1.7f)  // What does val stand for?
    h3.hello()
    println("BMI: $h3.bmi()")
    // var or val
    val age = 19
    val age_2: Int = 20

    var weight = 66.5
    var weight_2 = 66.5
    var name: String
    name = "Hank"

}
// control + V to pop up the VCS window

class Human {
    fun hello() {
        println("Hello Kotlin 3")
    }
}

class HumanVer2(var weight: Float, var height: Float) {

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin 3")
    }
}

// Kotlin 有主要建構子跟次要建構子
// Primary Constructor and Secondary Constructor

//class HumanVer3 constructor(var weight: Float, var height: Float) {
//                ~~~~~~~~~~~ 這邊即是Primary constructor , constructor 關鍵字可省略
class HumanVer3(var weight: Float, var height: Float) {
    init { // 這是建立object時，額外執行的部份
        println("Test on $weight")
        weight += 100
    }

    //次要建構子中，不可以使用var, val 這類的關鍵字
    // FIXME: This Secondary constructor is not invoked!
    // TODO: The execution sequence of primary constructor, secondary constructor and init block?
    // TODO: What's the purpose for secondary constructor?
    constructor(weight: Float, height: Float, name: String = "victor") : this(weight, height)

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin 3")
    }
}



