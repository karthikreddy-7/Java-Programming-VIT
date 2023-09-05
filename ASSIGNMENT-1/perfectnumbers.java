import java.util.*;

public class perfectnumbers {

    public static boolean perfectnumber(int x) {
        boolean perfectnumber = false;
        int count = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                count = count + i;
            }
        }
        if (count == x) {
            perfectnumber = true;
        }
        return perfectnumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the number of rows values from the user:
        System.out.println("enter the number of rows: ");
        int x = sc.nextInt();
        System.out.println("enter the number of columns: ");
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        // assigning the elements and implementing the logic too:
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("enter the value of " + (i + 1) + " row and " + (j + 1) + " element");
                arr[i][j] = sc.nextInt();
                if (perfectnumber(arr[i][j])) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("the sum of the perfect numbers in the 2-D array is: " + sum);
        sc.close();
    }

}
