import java.io.IOException;
import java.util.Scanner;

public class Q1_CountSetBits {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Solution ob = new Solution();
        int cnt = ob.setBits(N);
        System.out.println(cnt);
        sc.close();

    }
}

class Solution {
    int setBits(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                n = n / 2;
            } else {
                n = n / 2;
            }
        }
        return count;
    }
}