package chapter2._02_01.begin

fun main() {
    var count: Int = 0
    val number: Int = 42

    val otherNumber: Int = 43

    val myLong: Long = 3000000000L
    val myByte: Byte = 127
    val myShort: Short = 3237

    val myDouble: Double = 98.6
    val myFloat: Float = 12.2F
    val alsoDouble: Double = 101.5

    val asInt = alsoDouble.toInt()
    val asFloat = myLong.toFloat()

    val maxInt = 2_147_333_648
}
