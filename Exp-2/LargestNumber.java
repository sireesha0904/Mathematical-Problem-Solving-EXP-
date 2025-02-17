import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();  // Read the number of elements
        
        int[] arr = new int[n];
        
        // Input: Elements of the array
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read elements one by one
        }

        // Finding the largest element
        int largest = arr[0]; // Assume first element is the largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Output: Largest element
        System.out.println("The largest number in the array is: " + largest);
        
        sc.close();
    }
}
