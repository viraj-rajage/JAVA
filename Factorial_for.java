//package JAVA;

import java.util.Scanner;

public class Factorial_for {
    public static void main(String[] args) {
        int num,i,f=1; 
        System.out.println("Enter the number");
        Scanner r= new Scanner(System.in);  
        r.close();
        num =r.nextInt(); 
        for(i=1;i<=num;i++){
            f=f*i; 
        } 
        System.out.println("factorial of thise number is:="+f);
        
    }
}
