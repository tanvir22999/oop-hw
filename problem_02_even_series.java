import java.util.Scanner;

public class problem_02_even_series {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 2; i <= n; i += 2) {
      System.out.print(i + " ");
    }
    System.out.println();
    int i = 2;
    while (i <= n) {
      System.out.print(i + " ");
      i += 2;
    }
    System.out.println();
    int j = 2;
    do {
      System.out.print(j + " ");
      j += 2;
    } while (j <= n);
  }
}
