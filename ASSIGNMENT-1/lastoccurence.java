
import java.util.*;

public class lastoccurence {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String:");
        String s = sc.nextLine();
        System.out.println("enter the character to be searched for:");
        char c = sc.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result = i;
            }
        }
        System.out.println("the last occurence of the given character in the string was : " + result);
        sc.close();

    }

}
