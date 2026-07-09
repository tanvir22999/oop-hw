//Find the area of a triangle (2) : √(s *(s-a)*(s-b)*(s-c)) 
//where s = (a+b+c) / 3

import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three arm of triangle: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float s = (a + b + c) / 3;
        System.out.println("The area of the triangle is: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

}
