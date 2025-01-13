package Practice_Problem_01_contd;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST INTEGER: ");
        int num1=input.nextInt();
        System.out.print("ENTER THE SECOND INTEGER: ");
        int num2=input.nextInt();
        System.out.print("ENTER THE Operator: ");
        char operator=input.next().charAt(0);
        double result;
        if(operator=='+'){
            result=num1+num2;
            System.out.println("Result:"+result);
        }
        else if(operator=='-'){
            result=num1-num2;
            System.out.println("Result:"+result);
        }
        else if(operator=='*'){
            result=num1*num2;
            System.out.println("Result:"+result);
        }
        else{
            if(num2!=0){
                result=(double)num1/num2;
                System.out.println("Result:"+result);
            }
            else{
                System.out.println("Result: Error");
            }
        }
    }
}
