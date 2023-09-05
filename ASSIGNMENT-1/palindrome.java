import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        // user input:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        boolean palindrome = true;
        // finding the length of the string:
        int n = s.length();
        // Approach: taking two pointers left and right
        // where left starts from begining of string
        // right starts from the ending of string
        int left = 0;
        int right = n - 1;
        // we know that palindrome is same from front and back
        // so we check if the letters of index left and right is equal or not
        while (left <= right && palindrome) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
            } else {
                left++;
                right--;
            }
        }
        if (palindrome) {
            System.out.println("the given word " + s + " is a palindrome");
        } else {
            System.out.println("the given word " + s + " is not a palindrome");
        }
        sc.close();
    }
}
