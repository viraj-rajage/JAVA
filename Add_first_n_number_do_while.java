import java.util.*;
public class Add_first_n_number_do_while {
    public static void main(String[] args) {
        int number,z;  
        int i=0,sum=1; 
        System.out.println("enter the limet");
        Scanner v = new Scanner(System.in); 
        number =v.nextInt(); 
      do {
        sum=sum+i; 
        i++;
      } while (i<=number);
       z=sum-1;
        System.out.println("sum of n natural number is following "+z); 
        v.close(); 
        
    }
}
