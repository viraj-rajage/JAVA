import java.util.Scanner;

public class Add_first_n_number {
    public static void main(String[] args) {
        int a; 
        int sum=0; 
        System.out.println("enter the n'th number"); 
        Scanner v = new Scanner(System.in); 
        a=v.nextInt(); 
        for(int i=1;i<a;i++){
            sum=sum+i; 
//1,2,3,4,5
        } 
        System.out.println(sum+a); 
        v.close();
    }
}
