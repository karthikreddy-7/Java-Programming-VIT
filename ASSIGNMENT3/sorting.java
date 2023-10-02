package ASSIGNMENT3;

import java.util.Scanner;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sorting1 sort = new Sorting1(arr);
        AscendingThread ascending = new AscendingThread(sort);

        // Create a copy of the original array for the descending thread
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Sorting1 sortCopy = new Sorting1(arrCopy);
        DescendingThread descending = new DescendingThread(sortCopy);

        ascending.start();
        descending.start();
        try {
            ascending.join();
            descending.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        // Print the sorted array after both threads have finished
        sort.print();
        sortCopy.print();
        sc.close();
    }
}

class Sorting1 {
    private final int[] arr;

    public Sorting1(int[] array) {
        this.arr = array;
    }

    public synchronized void ascending() {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            if (!swapped) {
                break;
            }

        }
    }

    public synchronized void descending() {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            if (!swapped) {
                break;
            }

        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class AscendingThread extends Thread {
    private final Sorting1 sort;

    public AscendingThread(Sorting1 sorting) {
        this.sort = sorting;
    }

    public void run() {
        sort.ascending();
    }
}

class DescendingThread extends Thread {
    private final Sorting1 sort;

    public DescendingThread(Sorting1 sort) {
        this.sort = sort;
    }

    public void run() {
        sort.descending();
    }
}
