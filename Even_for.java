//package JAVA;

import java.util.Scanner;

public class Even_for {
    public static void main(String[] args) {
        int a; 
        System.out.println("enter the number");
        Scanner v= new Scanner(System.in); 
        a=v.nextInt(); 
        v.close(); 
        for(int i=0;i<=a;i=i+2){
          System.out.println(i);
        }
    
    }
}
