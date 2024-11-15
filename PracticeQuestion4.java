import java.util.*;

public class PracticeQuestion4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = sc.next();
        System.out.println(startandendSameCharacter(str,0,0));
    }
    public static int startandendSameCharacter(String str,int start, int end){
        if(start >= str.length()){
            return 0;
        }
        if(end >= str.length()){
            return startandendSameCharacter(str, start+1, start+1);
        }
        int count = 0;
        if(str.charAt(start) == str.charAt(end)){
            count = 1;
        }
        return count + startandendSameCharacter(str, start, end+1);
    }
}
