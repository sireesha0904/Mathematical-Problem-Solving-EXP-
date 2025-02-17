import java.util.Scanner;

public class DistantElement {
    public static int findDistantElement(int[] arr) {
        int first = arr[0];
        int distant = arr[0];
        for (int num : arr) {
            if (Math.abs(first - num) > Math.abs(first - distant)) {
                distant = num;
            }
        }
        return distant;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The distant element from the first element is: " + findDistantElement(arr));
        sc.close();
    }
}
