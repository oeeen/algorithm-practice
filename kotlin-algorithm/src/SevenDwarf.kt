class SevenDwarf {
    fun solution() {
        val heights: ArrayList<Int> = ArrayList()
        for (i in 1..9) {
            heights.add(Integer.parseInt(readLine()))
        }

        for (i in heights.indices) {
            var sum = heights.sum()
            val first: Int = heights[i]
            sum -= heights[i]
            for (j in (i + 1) until heights.size) {
                sum -= heights[j]
                val second = heights[j]
                if (sum == 100) {
                    heights.remove(first)
                    heights.remove(second)
                    heights.sort()
                    for (k in heights.indices) println(heights[k])
                    return
                }
                sum += heights[j]
            }
            sum += heights[i]
        }


    }
}