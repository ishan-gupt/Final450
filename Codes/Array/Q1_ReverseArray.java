
//Reverse the array
import java.util.*;

class Q1_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = n - 1;
        if (j >= 0) {
            for (int i = 0; i < n; i++) {
                rev[i] = arr[j];
                j = j - 1;
            }
        }
        System.out.println("Reversed array");
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }
        sc.close();
    }
}