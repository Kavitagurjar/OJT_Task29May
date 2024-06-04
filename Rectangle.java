// inpit length
// input breadth
// formula for area = length * breadth

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of rectangle : ");
        int breadth = scanner.nextInt();
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}