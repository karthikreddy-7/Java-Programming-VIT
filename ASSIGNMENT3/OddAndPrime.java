package ASSIGNMENT3;

import java.util.ArrayList;

public class OddAndPrime {
    public static void main(String[] args) {
        OddNumbers odd = new OddNumbers();
        PrimeNumbers prime = new PrimeNumbers(odd.getOddNumbers());
        // Start the OddNumbers thread first
        System.out.println("the Odd Numbers from 1 to 100 is ");
        odd.start();

        try {
            odd.join(); // Wait for OddNumbers to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("the prime numbers within the odd numbers are :");

        // Start the PrimeNumbers thread after OddNumbers has finished
        prime.start();

        try {
            prime.join(); // Wait for PrimeNumbers to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class OddNumbers extends Thread {
    ArrayList<Integer> oddnumbers = new ArrayList<>();

    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
            oddnumbers.add(i);
        }
        System.out.println();
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddnumbers;
    }
}

class PrimeNumbers extends Thread {
    private ArrayList<Integer> oddnumbers;
    private ArrayList<Integer> primenumbers = new ArrayList<>();

    public PrimeNumbers(ArrayList<Integer> odd) {
        this.oddnumbers = odd;
    }

    public void run() {
        for (int num : oddnumbers) {
            if (isprime(num)) {
                System.out.print(num + " ");
                primenumbers.add(num);
            }
        }
    }

    public boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}