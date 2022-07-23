import java.util.Arrays;
import java.util.Scanner;

public class Q12_MergeSortedArray {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        int n, m;

        // taking size of array a
        n = sc.nextInt();

        // taking size of array b
        m = sc.nextInt();

        // Creating 2 array of size n and m
        int a[] = new int[n];
        int b[] = new int[m];

        // inserting elements to array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // inserting elements to array b
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        // calling doUnion method and printing the results
        ob.merge(a, n, b, m);
        sc.close();
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        for (int i = m; i < m + n; i++) {
            System.out.println(nums1[1] + " ");
        }
    }
}
