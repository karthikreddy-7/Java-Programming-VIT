/* 
 * overload the methods to compute area and volume of different figures (atleast 3 figures)
 */

import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this program calculates the area and volume of cube,cubiod and cylinder");
        // Cube figure:
        System.out.println("enter the side of the cube : ");
        int x = sc.nextInt();
        // shape class which contains different methods
        shape s = new shape();
        s.area(x);
        s.volume(x);
        // cylinder figure:
        System.out.println("enter the radius of the cylinder :");
        int y1 = sc.nextInt();
        System.out.println("enter the height of the cylinder :");
        int y2 = sc.nextInt();
        s.area(y1, y2);
        s.volume(y1, y2);
        // cubiod figure:
        System.out.println("enter the length of the cube : ");
        int x1 = sc.nextInt();
        System.out.println("enter the breadth of the cube : ");
        int x2 = sc.nextInt();
        System.out.println("enter the height of the cube : ");
        int x3 = sc.nextInt();
        s.area(x1, x2, x3);
        s.volume(x1, x2, x3);
        sc.close();

    }
}

class shape {
    public void area(int side) {
        System.out.println("the surface area of the cube is " + side * side);
    }

    public void area(int length, int breadth, int height) {
        System.out.println("the surface area of the cuboid is "
                + 2 * ((length * breadth) + (breadth * height) + (length * height)));
    }

    public void area(int radius, int height) {
        System.out.println("the surface area of the cylinder is "
                + (2 * (3.14) * radius * height + 2 * (3.14) * (radius * radius)));
    }

    public void volume(int side) {
        System.out.println("the volume of the cube is " + side * side * side);
    }

    public void volume(int length, int breadth, int height) {
        System.out.println("the volume of the cuboid is " + length * breadth * height);
    }

    public void volume(int radius, int height) {
        System.out.println("the volume of the cylinder is " + (3.14) * (radius * radius) * height);
    }

}
