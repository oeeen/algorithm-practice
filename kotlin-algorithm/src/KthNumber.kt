class KthNumber {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = IntArray(commands.size)
        for (i in commands.indices) answer[i] =
            array.sliceArray(IntRange(commands[i][0] - 1, commands[i][1] - 1)).sortedArray()[commands[i][2] - 1]
        return answer
    }
}