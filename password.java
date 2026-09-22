import java.util.Scanner;

public class password {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pass = 12345, n;
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter your password: ");
      n = sc.nextInt();
      if (n == pass) {
        System.out.println("Correct Password");
        break;
      } else {
        if (i < 2)
          System.out.println("Try again");
        else
          System.out.println("Blocked now");
      }
    }
  }
}
