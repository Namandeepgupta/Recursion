import java.util.*;

public class PracticeQuestion3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = sc.next();
        System.out.println("Length: " + StringLength(str,0));
    } 
    public static int StringLength(String str, int index){
        try{
            if(str.charAt(index) == ' '){
            return 0;
            }
            else{
                return (1 + StringLength(str, index+1));
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
