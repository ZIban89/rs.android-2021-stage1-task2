package subtask1

import java.util.*

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        var result = ""
        val c: Calendar = Calendar.getInstance()
        c.isLenient = false
        try{
            c.set(year.toInt(), month.toInt()-1, day.toInt())
            result = "${c.get(Calendar.DAY_OF_MONTH)} " +
                    "${c.getDisplayName(2, Calendar.LONG_FORMAT, Locale("ru", "RU", "RU"))}, " +
                    "${c.getDisplayName(7, Calendar.LONG_FORMAT, Locale("ru", "RU", "RU"))}"
        }catch(e: Exception){
            return "Такого дня не существует"
        }
        return result
    }
}
