package chapter3._03_01.begin

fun returnsNothing() {
    println("returnsNothing() function")
}

fun main() {
    val bigger = 1000
    val smaller = 1
    val max = if (bigger > smaller) bigger else smaller

    val age = 21
    val boardGroup = when (age) {
        in 0..18 -> "family"
        in 65..200 -> "senior"
        else -> "regular"
    }
    println("You are in the $boardGroup group")

    val fromNothing = returnsNothing()
    println("$fromNothing")

    val a = 100
    val b = 101

}
