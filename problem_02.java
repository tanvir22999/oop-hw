import java.util.Scanner;

public class problem_02 { // Find the volume of a ball: 4/3 * pi * radius^3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the ball: ");
        float radius = sc.nextFloat();
        System.out.println("The volume of a ball : " + 4 / 3 * 3.14 * radius * radius * radius);
    }

}
