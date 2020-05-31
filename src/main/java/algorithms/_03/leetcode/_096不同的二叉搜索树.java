package algorithms._03.leetcode;

public class _096不同的二叉搜索树 {

    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++)
            for(int j = 1; j < i + 1; j++)
                dp[i] += dp[j-1] * dp[i-j];

        return dp[n];
    }
}

