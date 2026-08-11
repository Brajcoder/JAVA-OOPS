import java.util.Scanner;
public class arr_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        
        // Taking input for the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        
        // Copying elements from arr1 to arr2
        int[] arr2 = new int[n];
        System.arraycopy(arr1, 0, arr2, 2, n-2);
        
        // Displaying the elements of the copied array
        System.out.println("Elements of the copied array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + arr2[i]);
        }
        
        sc.close();
    }
}
