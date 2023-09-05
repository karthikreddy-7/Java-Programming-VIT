import java.util.*;

public class mergingarrays {

    public static boolean check(int[] arr, int k) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the size of the arrays from the user:
        System.out.println("enter the size of the 1st array: ");
        int n1 = sc.nextInt();
        System.out.println("enter the size of the 2nd array: ");
        int n2 = sc.nextInt();
        // intializing and decalaration of 1st and 2nd array:
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n1 + n2];
        // assignment of the arrays:
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter the " + (i + 1) + " value of 1st array :");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter the " + (i + 1) + " value of 2nd array :");
            arr2[i] = sc.nextInt();
        }
        // adding all the elements of the 1st array and then adding only unique elements
        // of 2nd array:
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        // now adding unique elements from 2nd array:
        int k = n1;
        for (int i = 0; i < n2; i++) {
            boolean found = check(arr3, arr2[i]);
            if (!found) {
                arr3[k] = arr2[i];
                k++;
            }
        }
        // displaying the combined array elements:
        System.out.println("the combined array of array 1 and 2 with removing the duplicates is : ");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] != 0) {
                System.out.print(arr3[i] + " ");
            }

        }
        sc.close();
    }

}
