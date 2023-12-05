//package JAVA;
import java.util.Scanner;

public class Even_while_do {
    public static void main(String[] args) {
        int a,i=0; 
        System.out.println("enter the number");
        Scanner v= new Scanner(System.in); 
        a= v .nextInt(); 
        v.close();
        do{ 
            i=i+2; 
            System.out.println(i);

        }while(i<=a);
      
    }
}
