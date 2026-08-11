import java.util.Scanner;
public class Day_of_the_week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();

        String dayOfWeek = getDayOfWeek(dayNumber);
        System.out.println("The day of the week is: " + dayOfWeek);
        scanner.close();
    }

    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid input! Please enter a number between 1 and 7.";
        }
    }
    
}
