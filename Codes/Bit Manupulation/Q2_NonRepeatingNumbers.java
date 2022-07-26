import java.util.Arrays;
import java.util.Scanner;

public class Q2_NonRepeatingNumbers {
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
        Solution obj = new Solution(); // calling doUnion method and printing the results
        System.out.println(obj.singleNumber(a));
        sc.close();
    }
}

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                if (nums[i] == nums[i + 1]) {
                    i++;
                } else {
                    arr[a] = nums[i];
                    a++;
                    if (a == 2) {
                        break;
                    }
                }
            } else {
                arr[a] = nums[i];
                a++;
                if (a == 2) {
                    break;
                }
            }
        }
        return arr;
    }
}