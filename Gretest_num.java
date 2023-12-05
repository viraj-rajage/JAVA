import java.util.Scanner;
public class Gretest_num {
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + "is gretest  number");
            } else {
                System.out.println(num3 + "is gretest number ");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + "is gretest number");
            } else {
                System.out.println(num3 + "is gretest number ");
            }
        }
        obj.close();
    }
}
