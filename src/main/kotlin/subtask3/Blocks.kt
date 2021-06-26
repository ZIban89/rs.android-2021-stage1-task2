package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {


    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB){
            Int::class -> {
                var result = 0
                for(i in blockA) {
                    if(i is Int)
                        result += i
                }
                return result
            }
            String::class -> {
                var result = ""
                for(i in blockA) {
                    if(i is String)
                        result += i
                }
                return result
            }
            LocalDate::class -> {
                var result = LocalDate.parse("1970-01-01")
                for(i in blockA) {
                    if(i is LocalDate)
                        if(i.isAfter(result)) result = i
                }
                return "${result.dayOfMonth}.${result.monthValue}.${result.year}"
            }
        }
        throw IllegalArgumentException("Что за входные данные?!")
    }
}
