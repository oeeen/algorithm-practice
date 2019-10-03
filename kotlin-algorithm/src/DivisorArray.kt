class DivisorArray {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = ArrayList<Int>()

        for (i in arr) {
            if (i % divisor == 0) {
                answer.add(i)
            }
        }
        return if (answer.size != 0) answer.sorted().toIntArray() else intArrayOf(-1)
    }
}