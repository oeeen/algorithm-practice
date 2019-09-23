class ChooseCenter {
    fun solution(s: String): String {
        val center: Int = s.length / 2
        var answer = ""

        if (s.length % 2 == 1) {
            answer += s[center]
        } else {
            answer += s.substring(center - 1, center+1)
        }
        return answer
    }
}