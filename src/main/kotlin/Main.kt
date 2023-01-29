import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")


    val d1 = "2022-10-29T00:00:00Z"
    val d2 = "2022-12-14T00:58:38.387Z"

//    val parser = SimpleDateFormat(DATE_FORMAT_Z, Locale.getDefault())
//    val formatter = SimpleDateFormat(DATE_FORMAT_MM_DD_YYYY, Locale.getDefault())
//    try {
//        val f = formatter.format(parser.parse(d1))
//    } catch (E:)

    val x = getFormattedDateTime(DATE_FORMAT_UTC_Z, DATE_FORMAT_Z, DATE_FORMAT_MM_DD_YY_HH_MM, d1)
    println(x)
    val x1 = getFormattedDateTime(DATE_FORMAT_UTC_Z, DATE_FORMAT_Z, DATE_FORMAT_MM_DD_YY_HH_MM, d2)
    println(x1)
}

fun getFormattedDateTime(oldFormat1: String,oldFormat2: String, newFormat: String, date: String): String {
    return try {
        val parser = SimpleDateFormat(oldFormat1, Locale.getDefault())
        val formatter = SimpleDateFormat(newFormat, Locale.getDefault())
        formatter.format(parser.parse(date))
    } catch (exception: ParseException) {
        try {
            val parser = SimpleDateFormat(oldFormat2, Locale.getDefault())
            val formatter = SimpleDateFormat(newFormat, Locale.getDefault())
            formatter.format(parser.parse(date))
        } catch (e:Exception) {
            ""
        }
    }
}

const val DATE_FORMAT_MM_DD_YYYY= "MM/dd/yyyy"
const val DATE_FORMAT_MM_DD_YY_HH_MM = "MM/dd/yyyy hh:mm aa"
const val DATE_FORMAT_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
const val DATE_FORMAT_UTC_Z = "yyyy-MM-dd'T'HH:mm:ss'Z'"
