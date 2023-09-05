import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        // reading the string from the user:
        String s = sc.nextLine();
        System.out.println("enter the Starting substring value: ");
        // reading the starting substring value :
        int x = sc.nextInt();
        System.out.println("enter the ending substring value: ");
        // reading the ending substring value:
        int y = sc.nextInt();
        System.out.println("the substring is : ");
        for (int i = x; i <= y; i++) {
            System.out.print(s.charAt(i));
        }

        sc.close();

    }

}
