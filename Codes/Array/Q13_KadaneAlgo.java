import java.util.Scanner;

public class Q13_KadaneAlgo {
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
        long s = obj.maxSubarraySum(a, n);
        // calling doUnion method and printing the results
        System.out.println(s);
        sc.close();
    }
}

class Solution {

    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    public long maxSubarraySum(int arr[], int n) {
        long msum = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum > msum) {
                msum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return msum;
        // Your code here

    }

}
