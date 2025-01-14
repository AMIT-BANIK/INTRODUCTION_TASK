package classTask;
import java.util.Scanner;
public class constructor {
    String lang= "C";
    constructor() {
        lang = "Java";
    }
        constructor(String Name) {
            lang = Name;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        constructor constructorObj1=new constructor();
        System.out.println("We are learning:"+constructorObj1.lang);

        System.out.println("Enter String: ");
        String s=input.nextLine();
        constructor constructorObj2=new constructor(s);
        System.out.println("We are learning:"+constructorObj2.lang);
    }

}
//top label class
//initializer blocksrc