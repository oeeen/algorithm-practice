fun main() {
    val KthNumber = KthNumber()
    println(
        KthNumber.solution(
            intArrayOf(1, 5, 2, 6, 3, 7, 4),
            arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        )
    )
}