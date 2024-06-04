import java.util.Scanner;

public class GreetUser {
  private String name;
  private int age;

  public GreetUser(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void greet() {
    System.out.println("Hello, " + name + "! You are " + age + " years old.");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    GreetUser person = new GreetUser(name, age);
    person.greet();
  }
}
