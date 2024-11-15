import java.util.*;

public class PracticeQuestion1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        indexsOfGivenKey(arr,key,0);
    }
    public static void indexsOfGivenKey(int arr[], int key, int index){
        if(index == arr.length){
            return;
        }
        else{
            if(arr[index] == key){
                System.out.print(index + " ");
            }
            indexsOfGivenKey(arr, key, index+1);
        }
    }
}
