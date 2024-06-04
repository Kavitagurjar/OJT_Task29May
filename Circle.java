import java.util.Scanner;

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();

    Circle circle = new Circle(radius);
    double area = circle.calculateArea();

    System.out.println("Area of the circle: " + area);
  }
}
