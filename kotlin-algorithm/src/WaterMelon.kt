class WaterMelon {
    fun solution(s: Int): String {
        val center: Int = s / 2
        var answer = ""

        for (i in 1..center) {
            answer += "수박"
        }
        if (s%2 == 1) answer += "수"
        return answer
    }
}