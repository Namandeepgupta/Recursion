public class XPowerN {
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
            return num * xPowerN(num, power-1);
        }
    }
}
