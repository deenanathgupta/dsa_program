package string_programs

fun main() {

    val s1 = "xyz"
    val s2 = "hel"

    println(isAnagram(s1, s2))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val counter = IntArray(26)
    for (i in s.indices) {
        counter[(s.elementAt(i) - 97).code]++
        counter[(t.elementAt(i) - 97).code]--
    }

    counter.forEach {
        if (it != 0) return false
    }
    return true
}