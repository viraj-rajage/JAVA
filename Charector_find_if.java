//package JAVA;
import java.util.Scanner;
public class Charector_find_if {
   
    public static void main(String[] args) { 
        String vi; 
        System.out.println("enter the character");
        Scanner v= new Scanner(System.in); 
        vi=v.nextLine(); 
        if(vi.equals("a")||vi.equals("e")||vi.equals("i")||vi.equals("o")||vi.equals("u")||vi.equals("A")||vi.equals("E")||vi.equals("I")||vi.equals("O")||vi.equals("U")){
            System.out.println("thise char is vowels");
        } 
        else {
            System.out.println("thise char is consonant");
        } 
        v.close();

    }
}
