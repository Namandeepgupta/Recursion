import java.util.*;

public class PracticeQuestion5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disk: ");
        int n = sc.nextInt();
        towerOfHanoi(n,'A','B','C');
    }
    public static void towerOfHanoi(int n, char fromRod, char auxRod, char toRod){
        if(n == 1){
            System.out.println("Move disk 1 from rod " +fromRod+ " to rod " +toRod);
            return;
        }
        towerOfHanoi(n-1, fromRod, toRod, auxRod);
        System.out.println("Move disk " +n+ " from rod " +fromRod+ " to rod " +toRod);
        towerOfHanoi(n-1, auxRod, fromRod, toRod);
    }
}
