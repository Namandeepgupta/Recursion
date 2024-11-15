public class LastOccurance {
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int i = arr.length-1;
        System.out.println(lastOccur(arr, i, key));
    }
    public static int lastOccur(int arr[], int i, int key){
        if(i == 0){
            return -1;
        }
        else if(arr[i] == key){
            return i;
        }
        else{
            return lastOccur(arr, i-1, key);
        }
    } 
}
