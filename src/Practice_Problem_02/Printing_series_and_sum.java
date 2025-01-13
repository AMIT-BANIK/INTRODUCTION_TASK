package Practice_Problem_02;

import java.util.Scanner;
public class Printing_series_and_sum {
    static void fl(int []C){
        for(int a:C){
            System.out.println(a);
        }
    }
    static void Wl(int []C){
        int i=0;
        while(i<C.length){
            System.out.println(C[i]);
            i++;
        }
    }
    static void doWhile(int []C){
        int i=0;
        do{
            System.out.print(C[i]);
            i++;
        } while(i<C.length);
    }
    static int sum(int []C){
        int summ=0;
        for(int a:C){
            summ+=a;
        }
        return summ;
    }

    public static void main(String[] args){
        int []A={2,4,6,8,10,12,14,16,18,20};
        int []B={1,3,5,7,9,11,13,15,17,19};
        fl(A);
        System.out.println("Sum is: "+sum(A));
        Wl(B);
        System.out.println("Sum is: "+sum(B));
    }
}
