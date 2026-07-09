import java.util.Scanner;

public class problem_03 {
    //Find the area of a circle: pi * radius^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        float radius = sc.nextFloat();
        System.out.println("Area of circle is: "+ 3.14*radius*radius);
    }            
}
