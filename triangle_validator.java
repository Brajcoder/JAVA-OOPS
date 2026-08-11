import java.util.Scanner;
public class triangle_validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lengths of the three sides of the triangle (separated by spaces): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The lengths can form a valid triangle.");
        } else {
            System.out.println("The lengths cannot form a valid triangle.");
        }
        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
}
