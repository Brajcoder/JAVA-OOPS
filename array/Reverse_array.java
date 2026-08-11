import java.util.Scanner;
public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int [] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i];
        }
        System.out.println("Elements of the reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + reversedArr[i]);
        }

        sc.close();
    }
}