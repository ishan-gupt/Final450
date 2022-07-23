import java.io.IOException;
import java.util.Scanner;

public class Q7_Shiftby1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Compute obj = new Compute();
        obj.rotate(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        sc.close();

    }
}

class Compute {

    public void rotate(int arr[], int n) {
        int x = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
    }
}
