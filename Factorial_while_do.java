//package JAVA;

import java.util.Scanner;

public class Factorial_while_do {
    public static void main(String[] args) {
        
        int num;
        int i=1,fact=1; 

        System.out.println("enter the number"); 
        Scanner v=  new Scanner(System.in);
        num = v.nextInt();
        v.close(); 
        do {
            fact = fact*i; 
            i++;
        } while (i<=num); 
        System.out.println("Facrorial is :="+fact);
    }
}
