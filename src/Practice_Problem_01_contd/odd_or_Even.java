package Practice_Problem_01_contd;

import java.util.Scanner;

public class odd_or_Even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer :");
        int number=input.nextInt();
        if(number%2==0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }
}
