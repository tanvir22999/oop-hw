import java.util.Scanner;

public class problem_01_calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 1st integer");
    int a = sc.nextInt();
    System.out.println("Input 2nd integer");
    int b = sc.nextInt();
    while (true) {
      System.out.println("Input oparator");
      char ch = sc.next().charAt(0);
      if (ch == '+') {
        System.out.println("Answer: " + (a + b));
        break;
      } else if (ch == '-') {
        System.out.println("Answer: " + (a - b));
        break;
      } else if (ch == '*') {
        System.out.println("Answer: " + (a * b));
        break;
      } else if (ch == '/') {
        System.out.println("Answer: " + (a / b));
        break;
      } else {
        System.out.println("Not a valid oparator try again");
      }
    }
  }
}
