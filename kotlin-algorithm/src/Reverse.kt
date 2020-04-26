class Reverse {
    fun solution() {
        val n: Int = Integer.parseInt(readLine())
        for (i in 0 until n) {
            val input = readLine()
            val splitted = input?.split(" ")
            val sb = StringBuilder()
            splitted?.forEach { s -> sb.append(s.reversed()).append(" ") }
            println(sb.toString().trim())
        }
    }
}