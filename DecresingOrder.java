import java.util.*;

public class DecresingOrder{
    public static void printNumber(int n){
        if(n == 1){
            System.out.println(n + ".");
            return;
        }
        else{
            System.out.print(n + " ");
            printNumber(n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        printNumber(n);
    }
}