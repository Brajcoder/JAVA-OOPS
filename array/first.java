import java.util.Scanner;
public class first{
    public static void main(String[] argu){
        java.util.Scanner sc = new Scanner(System.in);
        // Different ways to declare and initialize arrays
        int [] arr = {1,2,3,4,5};
        int arr1[] = {6,7,8,9,10};
        

        int []arr2 = new int[5];
        int [] arr3 = new int[]{11,12,13,14,15};
        int [] arr4;
        arr4 = new int[]{16,17,18,19,20};
        
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr5 = new int[n];
        // Taking input for the elements of the array
        for(int i=0; i<n; i++){
            System.out.print("Enter the element at index " + i + ": ");
            arr5[i] = sc.nextInt();
        }
        // Displaying the elements of the array
        for(int i=0; i<n; i++){
            System.out.println("Element at index " + i + ": " + arr5[i]);
        }
        // Copying elements from arr4 to arr5
        int [] arr6 = new int[arr4.length];
        System.arraycopy(arr4,0,arr6,0,arr4.length);
        // Displaying the elements of the copied array
        for(int i=0; i<arr6.length; i++){
            System.out.println("Element at index " + i + ": " + arr6[i]);
        }
        sc.close();
    }
}