import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q6_Intersection {

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
        System.out.println(ob.intersection(a, b));
        sc.close();
    }

}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        final Iterator<Integer> itr = list.iterator();
        int k = 0;
        while (itr.hasNext()) {
            arr[k] = itr.next();
            k++;
        }
        return arr;

    }
}