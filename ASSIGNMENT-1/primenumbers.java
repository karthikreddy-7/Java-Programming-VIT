import java.util.*;

public class primenumbers {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N for showing the prime numbers which are from 1 To N :");
        int n = sc.nextInt();
        System.out.println("The prime numbers are :");
        for (int i = 0; i <= n; i++) {
            // checking number is prime or not by calling isprime function
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    // checks if the number is divisible any other number except 1 and itself and
    // returns a boolean value
    static boolean isprime(int k) {
        if (k < 2) {
            return false;
        }
        for (int j = 2; j < k; j++) {
            if (k % j == 0) {
                return false;
            }
        }
        return true;
    }

}
