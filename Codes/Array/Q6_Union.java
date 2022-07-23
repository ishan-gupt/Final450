import java.util.HashSet;
import java.util.Scanner;

class Q6_Union {

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
        System.out.println(ob.doUnion(a, n, b, m));
        sc.close();
    }

}

class Solution {
    public int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> list = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            list.add(b[i]);
        }
        return list.size();
    }
}