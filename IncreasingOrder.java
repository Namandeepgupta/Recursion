import java.util.*;

public class IncreasingOrder {
    public static void printNumber(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        else{
            printNumber(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        printNumber(n);
    }
}
