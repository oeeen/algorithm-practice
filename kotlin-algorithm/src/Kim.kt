class Kim {
    fun solution(seoul: Array<String>): String {
        return "김서방은 ${seoul.indexOf(seoul.find { s: String -> s.contains("Kim") })}에 있다."
    }
}