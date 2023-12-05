//package JAVA;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter the number");
        Scanner v= new Scanner(System.in);  
      
        n= v.nextInt(); 
        while (n>0) {
            r=n%10;   
            n=n/10;   
            System.out.print(r);
            n=n/10; 
        } 
        v.close();
    }
}
