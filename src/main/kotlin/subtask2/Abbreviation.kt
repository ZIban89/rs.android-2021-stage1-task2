package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val str = a.filter { b.contains(it, true) }.toUpperCase()
        when {
            str == b -> return "YES"
            str.length > b.length -> {
                var stri = 0
                var bi = 0
                var count = 0
                while (bi < b.length && stri < str.length)
                    if (b[bi] == str[stri]) {
                        count++
                        bi++
                        stri++
                    } else stri++
                if (count == b.length) return "YES"
            }
        }
        return "NO"
    }


}
