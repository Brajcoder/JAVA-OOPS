import java.util.Scanner;

public class Circle_Area_calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle: " + area);

        sc.close();
    }
}