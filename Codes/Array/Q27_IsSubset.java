import java.util.Scanner;

public class Q27_IsSubset {
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
        System.out.println(ob.isSubset(a, n, b, m));
        sc.close();
    }
}

class Solution {
    public String isSubset(int a1[], int n, int a2[], int m) {

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a2[i] == a1[j]) {
                    count++;
                }
            }
            if (count == 0) {
                return "No";
            }

        }
        return "Yes";
    }
}
