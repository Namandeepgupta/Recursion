public class FirstOccurance {
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        int i = 0;
        System.out.println(firstOccur(arr, i, key));
    }
    public static int firstOccur(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        else if(arr[i] == key){
            return i;
        }
        else{
            return firstOccur(arr, i+1, key);
        }
    } 
}
