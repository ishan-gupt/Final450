package String;

import java.util.Scanner;

class Q1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.next().charAt(0);
        }
        Solution solution = new Solution();
        solution.reverseString(c);
        for (int i = 0; i < n; i++) {
            System.out.println(c[i] + " ");
        }
        sc.close();

    }
}

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;
        }

    }
}