
//Find the "Kth" max and min element of an array 
import java.util.*;

class Q3_KthMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Enter the kth element u want to find");
        int k = sc.nextInt();
        System.out.println(k + " Minimum element is " + arr[k - 1]);
        System.out.println(k + " Maximum element is " + arr[(n - k)]);
        sc.close();
    }
}
