import java.util.Scanner;

public class Add_first_n_number_while { 
    public static void main(String[] args) {
        int number;  
        int z;
        int i=0,sum=1; 
        System.out.println("enter the limet");
        Scanner v = new Scanner(System.in); 
        number =v.nextInt(); 
        while (i<=number) {
            sum=sum+i; 
            i++;
        }  
        z=sum-1;
        System.out.println("sum of n natural number is following "+z); 
        v.close();
    } //1,2,3,4,5,=

}
