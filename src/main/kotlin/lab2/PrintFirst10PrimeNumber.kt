package lab2

/**
 * WAP to print first 10 prime numver
 * */
fun main() {
    println("Enter number how many prime number you want to print::")
    val input = readLine()!!.toInt()
    var count = 0
    var num = 2
    while (count < input) {
        var c = 0
        for (i in num downTo 2 step 1) {
            if (num % i == 0) {
                ++c
            }
        }
        if (c == 1) {
            ++count
            println(num)
        }
        ++num
    }
}