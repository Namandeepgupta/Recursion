public class SortedArray {
    public static void main(String args[]){
        int arr [] = {8, 9, 10};
        int i = 0;
        System.out.print("Result: " + isSorted(arr, i));
    }
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        else if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
}
