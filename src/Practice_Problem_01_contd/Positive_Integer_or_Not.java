package Practice_Problem_01_contd;

import java.util.Scanner;

public class Positive_Integer_or_Not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer :");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("The number is positive Integer");
        } else if (number < 0) {
            System.out.println("The number is negative Integer");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
