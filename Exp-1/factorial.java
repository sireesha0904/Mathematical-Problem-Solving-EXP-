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

    }
}