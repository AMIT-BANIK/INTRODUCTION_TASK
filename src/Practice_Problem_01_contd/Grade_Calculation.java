package Practice_Problem_01_contd;

import java.util.Scanner;

public class Grade_Calculation {
    public static void main(String[] args){
        int score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score:");
        score= input.nextInt();
        String grade;
        switch (score / 10) {
            case 10, 9-> grade = "A+";
            case 8 -> grade = "A";
            case 7 -> grade = "A-";
            case 6 -> grade = "B";
            case 5, 4 -> grade = "C+";
            default -> grade = "F";
        }
        System.out.println("Your grade is:"+grade);
    }
}
