package Design_ecommerce_platform;

import java.util.Scanner;
public class filterProduct {
    void filterProducts(String category){
        System.out.println("Filtering Product by category:"+category);
    }
    void filterProducts(int minimumPrice,int maximumPrice){
        System.out.println("Filtering Product by price range:"+minimumPrice+" to "+maximumPrice);
    }
    void filterProducts(String category,int minimumPrice,int maximumPrice){
        System.out.println("Filtering Product by category:"+category+" & with price range:"+minimumPrice+" to "+maximumPrice);
    }
    void filterProducts(String category,int minimumPrice,int maximumPrice,String brand){
        System.out.println("Filtering Product by category:"+category+"with price range:"+minimumPrice+" to "+maximumPrice+" & brand:"+brand);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        filterProduct fP=new filterProduct();
        System.out.print("Enter Category:");
        String Category=input.nextLine();
        System.out.print("Enter brand:");
        String brand=input.nextLine();
        System.out.print("Enter minimumPrice:");
        int minimumPrice=input.nextInt();
        System.out.print("Enter maximumPrice:");
        int maximumPrice=input.nextInt();
        fP.filterProducts(Category);
        fP.filterProducts(minimumPrice,maximumPrice);
        fP.filterProducts(Category,minimumPrice,maximumPrice);
        fP.filterProducts(Category,minimumPrice,maximumPrice,brand);

    }
}
