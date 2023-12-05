//package JAVA;

import java.util.Scanner;

public class Factorial_while {
    public static void main(String[] args) {
       int num; 
       int fact =1,i=1; 
       System.out.println(" enter thr number");
        Scanner v = new Scanner(System.in); 
        num= v.nextInt(); 
        v.close(); 
        while (i<=num) { 
            fact=fact*i; 
            i++;
        } 
        System.out.println("factorial number is :="+fact);
    }
}
