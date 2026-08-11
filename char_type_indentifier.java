import java.util.Scanner;
public class char_type_indentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (Character.isLetter(inputChar)) {
            System.out.println(inputChar + " is a letter.");
        } else if (Character.isDigit(inputChar)) {
            System.out.println(inputChar + " is a digit.");
        } else {
            System.out.println(inputChar + " is a special character.");
        }
        scanner.close();
    }
    
}
