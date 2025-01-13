package Practice_problem_03;

import java.util.Scanner;

public class Give_Madel {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the student's grade: ");
        double grade=input.nextDouble();
        if(grade>=3.5){
            System.out.print("Has the student completed the semester(true/false: ");
            boolean semesterCompleted= Boolean.parseBoolean(input.next());
            if(semesterCompleted){
                System.out.println("The student is awarded a medal.");

            }
            else{
                System.out.println("The student do not qualify for a medal because he have not completed the semester");
            }
        }
        else{
            System.out.println("The student do not qualify for a medal due to insufficient grade.");
        }
    }
}
