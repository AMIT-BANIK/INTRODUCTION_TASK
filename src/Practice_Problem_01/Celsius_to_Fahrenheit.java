package Practice_Problem_01;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args){
        double F,C;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of C: ");
        C = input.nextDouble();
        F=((C/5)*9)+32;
        System.out.println("The value on the fahrenheit scale will be :" + F);
    }
}
