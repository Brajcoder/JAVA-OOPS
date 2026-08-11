import java.util.Scanner;
import java.util.Arrays;

public class TwoDarray {
    public static void main(String[] args) {

        // ===========================
        // User Input 2D Array
        // ===========================

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] userArray = new int[rows][cols];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                userArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nUser Entered Array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(userArray[i][j] + " ");
            }
            System.out.println();
        }

        // ===========================
        // Declaration and Initialization
        // ===========================

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] arr1 = new int[3][3];

        int[][] arr2 = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Jagged Array
        int[][] arr3 = new int[3][];

        arr3[0] = new int[5];
        arr3[1] = new int[4];
        arr3[2] = new int[3];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i + j;
            }
        }

        // ===========================
        // Printing Arrays
        // ===========================

        System.out.println("\nArray arr:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nArray arr1 (Default Values):");
        for (int[] row : arr1) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nArray arr2:");
        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nJagged Array arr3:");
        for (int[] row : arr3) {
            System.out.println(Arrays.toString(row));
        }

        sc.close();
    }
}