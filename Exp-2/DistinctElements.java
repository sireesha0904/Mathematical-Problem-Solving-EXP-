import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt(); 

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        Set<Integer> distinctSet = new LinkedHashSet<>();  
        for (int num : arr) {
            distinctSet.add(num);
        }

        System.out.println("Distinct elements in the array: " + distinctSet);
        sc.close();
    }
}
