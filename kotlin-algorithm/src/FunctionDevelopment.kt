class FunctionDevelopment {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val remain: ArrayList<Int> = ArrayList()

        for (i in progresses.indices) {
            var remainProgress = 100 - progresses[i]
            if (remainProgress % speeds[i] != 0) {
                remainProgress += speeds[i]
            }
            remain.add(remainProgress / speeds[i])
        }

        val answer: ArrayList<Int> = ArrayList()

        var i = 0
        while (i < remain.size) {
            val day = remain[i]
            var count = 0
            for (j in i until remain.size) {
                remain[j] -= day
            }
            for (j in i until remain.size) {
                if (remain[j] <= 0) {
                    count++
                    i = j + 1
                } else {
                    i = j
                    break
                }
            }
            answer.add(count)
        }

        for (a in answer) {
            println(a)
        }
        return answer.toIntArray()
    }
}