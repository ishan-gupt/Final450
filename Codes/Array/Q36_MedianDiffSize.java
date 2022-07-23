import java.util.Arrays;
import java.util.Scanner;

public class Q36_MedianDiffSize {
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
        System.out.println(ob.find_median(a, n, b, m));
        sc.close();
    }
}

class Solution {
    public int find_median(int[] a, int n, int[] b, int m) {
        int v[] = new int[m + n];
        for (int i = 0; i < n; i++) {
            v[i] = a[i];
        }
        int k = 0;
        for (int j = n; j < n + m; j++) {
            v[j] = b[k];
            k++;
        }
        Arrays.sort(v);
        if (v.length % 2 == 0) {
            return (v[v.length / 2] + v[v.length / 2 - 1]) / 2;
        } else {
            return v[v.length / 2];
        }
    }
}