public class XPowerNOptimize {
    public static void main(String args[]){
        int num = 2;
        int power = 5;
        System.out.println("Result: " + xPowerN(num,power));
    }
    public static int xPowerN(int num, int power){
        if(power == 0){
            return 1;
        }
        else{
            int r = xPowerN(num, power/2);
            int result = r*r;
            if(power % 2 != 0){
                return (num * result);
            }
            else{
                return result;
            }
        }
    }
}
