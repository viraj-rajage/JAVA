import java.util.*;
public class Add_random_num {
    public static void main(String args[]) 
    {
        int n;  
        int sum=0; 
        System.out.println("enter the value of n number"); 
        Scanner v = new Scanner(System.in); 
        n=v.nextInt();  
        System.out.println("enter the "+n+" number");
        for(int i=0;i<n;i++){
            sum=v.nextInt(); 
            sum=sum+i; 

        } 
        System.out.println("sum of n number is following:="+sum);
        v.close();
    }
    } 
   