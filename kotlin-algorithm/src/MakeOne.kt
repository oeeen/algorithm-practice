class MakeOne {
    fun solution(): Int? {
        val dp = arrayOfNulls<Int>(1_000_001)
        val n: Int = Integer.parseInt(readLine())

        dp[1] = 0
        dp[2] = 1
        for (i in 2..n) {
            dp[i] = dp[i - 1]?.plus(1)
            if (i % 2 == 0) {
                dp[i] = if (dp[i]!! > dp[i / 2]!!) dp[i / 2]?.plus(1) else dp[i]
            }
            if (i % 3 == 0) {
                dp[i] = if (dp[i]!! > dp[i / 3]!!) dp[i / 3]?.plus(1) else dp[i]
            }
        }
        return dp[n]
    }
}