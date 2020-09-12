package leetCode;

public class ThreeHundredAndFiftySeven {


    public int countNumbersWithUniqueDigits(int n) {

        if (1>n || n>10)
            return 1;

        int[] dp = new int[n+1];
        dp[1] = 9;
        int result = 10;

        for (int i = 2; i <= n; i++){
            dp[i] = (10-i+1)*dp[i-1];
            result += dp[i];
        }
        return result;
    }

}
