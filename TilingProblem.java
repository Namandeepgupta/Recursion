public class TilingProblem {
    public static void main(String args[]){
        int n = 3;
        System.out.println("Number of Ways: " + tilingProblem(n));
    }
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            //for virtical
            int x = tilingProblem(n-1);
            //for horizental
            int y = tilingProblem(n-2);
            //for all ways
            return (x+y);
        }
    }
}
