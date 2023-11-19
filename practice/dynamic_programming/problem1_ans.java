package practice.dynamic_programming;

public class problem1_ans {
    public static void main(String[] args) {
        int n = 3;
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        System.out.println(fun(n, 0, dp));
    }

    public static int fun(int n, int i, int[] dp) {
        if (n == i) {
            return 1;
        }
        if (i > n) {
            return 0;
        }
        dp[i] = (fun(n, i + 1, dp) + fun(n, i + 2, dp));
        return dp[i];
    }
}