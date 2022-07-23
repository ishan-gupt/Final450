import java.util.Arrays;
import java.util.Scanner;

public class Q35_MedianEqualSize {
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
        Solution obj = new Solution();        // calling doUnion method and printing the results
        System.out.println(obj.find_median(a));
        sc.close();
    }
}
class Solution
{
    public int find_median(int[] v)
    {
        Arrays.sort(v);
        if(v.length % 2==0){
            return (v[v.length/2]+v[v.length/2-1])/2;
        }
        else{
            return v[v.length/2];
        }
    }
}