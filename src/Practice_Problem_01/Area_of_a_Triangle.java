package Practice_Problem_01;
import java.lang.*;
import java.util.Scanner;

public class Area_of_a_Triangle {
    public static void main(String[] args) {
        float base, height, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base");
        base = input.nextFloat();
        System.out.print("Enter the height");
        height = input.nextFloat();
        area = base * height * 0.5f;
        System.out.println("The area of the triangle is : " + area);
    }

}
