//package JAVA;

import java.util.Scanner;

public class Even_while {
    public static void main(String[] args) {
        int a, i=0; 
        System.out.println("Enter the number"); 
        Scanner v = new Scanner(System.in); 
        a=v.nextInt(); 
        v.close(); 
        while(i<=a){
            i=i+2; 
            System.out.println(i);
        }
    }
}
