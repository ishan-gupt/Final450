import java.util.Scanner;

public class Q17_BuySellStocks {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        int n;

        // taking size of array a
        n = sc.nextInt();

        // Creating 2 array of size n and m
        int a[] = new int[n];
        // inserting elements to array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        long s = obj.maxProfit(a);
        // calling doUnion method and printing the results
        System.out.println(s);
        sc.close();
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int msum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            sum = sum + prices[i] - prices[i - 1];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > msum) {
                msum = sum;
            }

        }
        if (msum < 0) {
            msum = 0;
        }
        return msum;
    }
}