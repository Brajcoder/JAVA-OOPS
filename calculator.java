import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        
        int product = num1 * num2;
        System.out.println("Product: " + product);

        
        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }
        sc.close();
    }
}
