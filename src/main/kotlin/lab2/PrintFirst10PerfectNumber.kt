package lab2

import kotlin.coroutines.CoroutineContext

/**
 * WAP to display first 10 perfect number
 * i.e: 6
 * a positive integer that is equal to the sum of its proper divisors: 1+2+3
 * */
fun main() {
    println("Enter number how many perfect number you want to print::")
    val input = readLine()!!.toInt()
    var count = 0
    var num = 2
    if(input > 4) return
    while (count < input) {
        var sum = 0
        for (i in 1.. num/2  step 1) {
            if (num % i == 0) {
                sum += i
            }
        }
        if (sum == num) {
            ++count
            println(num)
        }
        ++num
    }
}