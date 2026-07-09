//Write a program to check whether a given input is an odd or even number.

import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Integer: ");
        int value = sc.nextInt();
        if (value % 2 == 1)
            System.out.println("The integer is odd!");
        else
            System.out.println("Integer value is even!");
    }
}

// git remote add origin https://github.com/tanvir22999/oop-hw.git
// git branch -M main
// git push -u origin main