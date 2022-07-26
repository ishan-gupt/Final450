package String;

import java.util.Scanner;

public class Q2_StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        Solution ob = new Solution();
        System.out.println(ob.isPalindrome(S));
        sc.close();
    }
}

class Solution {
    int isPalindrome(String s) {
        for (int i = 0; i < (s.length()) / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return 0;
            }
        }
        return 1;
    }
}