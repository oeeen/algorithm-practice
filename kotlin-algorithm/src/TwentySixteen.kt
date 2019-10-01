class TwentySixteen {
    fun solution(a: Int, b: Int): String {
        val date = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val day = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

        var sum = 0
        for (i in 0 until a - 1) {
            sum += date[i]
        }
        sum += b
        return day[(sum - 1) % 7]
    }
}