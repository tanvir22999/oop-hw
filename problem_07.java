//Write a program to check whether a given input is a positive integer or not.

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer Number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("The integer number is positive");
        else
            System.out.println("The integer number is negative");
    }
}
