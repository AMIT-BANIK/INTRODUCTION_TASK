package Practice_Problem_01;

import java.util.Scanner;

public class Area_of_Triangle_2 {
    public static void main(String[] args) {
        double a,b,c,s,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        a=input.nextDouble();
        System.out.print("Enter the value of b :");
        b=input.nextDouble();
        System.out.print("Enter the value of c :");
        c=input.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle(2) is : " + area);
    }
}
