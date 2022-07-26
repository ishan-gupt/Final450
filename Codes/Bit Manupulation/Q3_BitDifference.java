import java.util.Scanner;

public class Q3_BitDifference {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        int a, b;

        // taking size of array a
        a = sc.nextInt();

        // taking size of array b
        b = sc.nextInt();
        Solution ob = new Solution();
        // calling doUnion method and printing the results
        System.out.println(ob.countBitsFlip(a, b));
        sc.close();
    }
}

class Solution {

    // Function to find number of bits needed to be flipped to convert A to B
    public int countBitsFlip(int a, int b) {
        int count = 0;
        while (a > 0 || b > 0) {
            if (a % 2 != b % 2) {
                count++;
            }
            a = a / 2;
            b = b / 2;
        }
        return count;
        // Your code here

    }

}