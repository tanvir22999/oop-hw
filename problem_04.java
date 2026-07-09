//Convert Celsius scale to Fahrenheit: C / 5 = (F - 32) / 9

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input celsius scale value: ");
        float celsius = sc.nextFloat();
        System.out.println("Fahrenheit Value is: " + (celsius / 5) * 9 + 32);
    }
}
