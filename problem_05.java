//Find the area of a equilateral triangle: (√3 / 4) * arm^2

import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arm of equilaterial triangle: ");
        float arm = sc.nextFloat();
        System.out.println("The area of the triangle is: " + (Math.sqrt(3) / 4) * arm * arm);
    }
}