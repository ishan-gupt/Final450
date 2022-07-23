import java.util.Scanner;

public class Q34_ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Solution sol = new Solution();
            System.out.println(sol.palinArray(a, n));
            sc.close();
        }
    }
}

class Solution {

    public int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int r = 0;
            while (x != 0) {
                int f = x % 10;
                r = r * 10 + f;
                x = x / 10;
            }
            if (r != a[i]) {
                return 0;
            }
        }
        return 1;
    }
}