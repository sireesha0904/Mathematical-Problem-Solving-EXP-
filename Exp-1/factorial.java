package Exp1;
import java.util.Scanner;
public class Factorial {

    public static int factorialNum(int n){
        if(n==0 || n==1)
        return 1;
        else 
        return n * factorialNum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int n = sc.nextInt();
        int fact = factorialNum(n);
        System.out.println("Factorial of " + n + " is: " + fact);
        sc.close();

    }
}