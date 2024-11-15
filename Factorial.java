import java.util.*;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return ( n * factorial(n-1) );
        }
    } 
}
