import java.util.*;

public class Kthsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of the array:
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // assigning elements:
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " value:");
            arr[i] = sc.nextInt();
        }
        // asking the Kth value from the user:
        System.out.println("enter the Kth value:");
        int k = sc.nextInt();
        // sorting the array using bubble sort:
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        // printing the kth smallest value from the sorted array:
        if (k <= n) {
            System.out.println("the Kth smallest element in the array is:" + arr[k - 1]);
        } else {
            System.out.println("Kth value is greater than the Array size");
        }
        sc.close();
    }
}
