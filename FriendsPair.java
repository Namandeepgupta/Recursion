public class FriendsPair {
    public static void main(String args[]){
        int num = 3;
        System.out.println("Number of Ways: " + friendsPair(num));
    }
    public static int friendsPair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        else{
            return (friendsPair(n-1) + (n-1) * friendsPair(n-2));
        }
    }
}
