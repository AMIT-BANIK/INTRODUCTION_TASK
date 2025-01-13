package Practice_problem_03;

import java.util.Scanner;

public class Store_and_Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=input.nextInt();
        double []A=new double[n];
        double sum=0;
        for(int i=0;i<n;i++){
            A[i]=input.nextDouble();
        }
        for(double value:A){
            sum+=value;
        }
        double avg=sum/n;
        System.out.println("Average is: "+avg);
    }
}
