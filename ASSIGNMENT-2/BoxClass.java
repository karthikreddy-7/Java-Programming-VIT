/* 
 * create a class box with the data members length,breadth and height. volume of the box
 * can be calculated as L*B*H. create three boxes where the length,breadth and the height of the third
 * box is the sum of the length,breadth and height of first two boxes. calculate the vplume oof three boxes.
 * use appropriate constructors and methods
 */

import java.util.Scanner;

public class BoxClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of 1st box:");
        int x1 = sc.nextInt();
        System.out.println("Enter the breadth of 1st box:");
        int x2 = sc.nextInt();
        System.out.println("Enter the height of 1st box:");
        int x3 = sc.nextInt();
        // first box instance :
        box b1 = new box(x1, x2, x3);
        b1.volume();
        System.out.println("Enter the length of 2nd box:");
        int y1 = sc.nextInt();
        System.out.println("Enter the breadth of 2nd box:");
        int y2 = sc.nextInt();
        System.out.println("Enter the height of 2nd box:");
        int y3 = sc.nextInt();
        // second box:
        box b2 = new box(y1, y2, y3);
        b2.volume();

        // 3rd box:
        System.out.println(
                "the length,breadth and the height of the third box is the sum of the length,breadth and height of first two boxes");
        box b3 = new box(x1 + y1, x2 + y2, x3 + y3);
        b3.volume();
        sc.close();

    }
}

class box {
    int length;
    int breadth;
    int height;

    public box(int l, int b, int h) {
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    void volume() {
        System.out.println("the volume of the box is : " + length * breadth * height);
    }
}
