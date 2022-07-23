import java.util.HashSet;
import java.util.Scanner;

public class Q11_Duplicates {
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
        System.out.println(obj.findDuplicate(a));
        sc.close();
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.add(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }
}