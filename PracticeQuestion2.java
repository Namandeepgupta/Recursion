import java.util.*;

public class PracticeQuestion2 {

    public static String digits[] = {"Zero","One","Two","Three","Four","Five",
    "Six","Seven","Eight","Nine"};

    public static void numberToString(int num){
        if(num == 0){
            return;
        }
        else{
            int lastdigit = num%10;
            numberToString(num/10);
            System.out.print(digits[lastdigit] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print("Number To String: ");
        numberToString(num);
        System.out.println();
    }
}
