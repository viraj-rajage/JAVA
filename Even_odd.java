//package JAVA;
import java.util.*;
// to check the number is even or odd
public class Even_odd {
    public static void main(String[] args) {
        int a; 
        System.out.println("Enter the number");
        Scanner v = new Scanner(System.in);  
        a= v.nextInt(); 
        if(a%2==0){
            System.out.println("number is even");
        } 
        else{
            System.out.println("number is odd");
        } 
        v.close();
        
    }
}