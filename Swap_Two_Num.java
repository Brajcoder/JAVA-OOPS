import java.util.Scanner;
public class Swap_Two_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        //with 3rd variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // without 3rd variable
        // num1 =num1+num2;
        // num2 =num1-num2;
        // num1 =num1-num2;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        sc.close();
    }
}