import java.util.Scanner;

public class Distance {
    // Method to calculate distance between two coordinates
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x coordinate of point 1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y coordinate of point 1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x coordinate of point 2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y coordinate of point 2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("Distance between the two points: " + distance);
    }
}