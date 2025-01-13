package Practice_Problem_02;

import java.util.Scanner;

public class Leap_Year {
    static boolean leapYear(int year){
        if(year%400==0 || year%4==0){
            if(year%100!=0) {
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year=input.nextInt();
        if(leapYear(year)){
            System.out.println("The given year is leap year.");
        }
        else{
            System.out.println("The given year is not leap year.");
        }
    }
}
