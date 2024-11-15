import java.util.*;

public class Fibbnacci{
    public static int fibbnacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            int x = fibbnacci(n - 1);
            int y = fibbnacci(n-2);
            return (x + y);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n = sc.nextInt();
        System.out.println("Fibbnacci: " + fibbnacci(n));
    }
}