import java.util.*;

public class SumOfFirstNNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("Sum: " + sum(n));
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }
}
