import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the trangle height and width: ");
        float height = sc.nextFloat();
        float width = sc.nextFloat();
        System.out.println("The area is : " + 0.5 * height * width);
    }
}
