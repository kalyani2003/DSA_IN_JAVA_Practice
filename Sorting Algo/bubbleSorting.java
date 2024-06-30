import java.util.*;
    public class bubbleSorting{
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,7,8,9,4};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){

                if(arr[i]> arr[i+1]){

                    int temp=arr[j];
                    int arr[j] = arr[j+1];
                    int arr[j+1] =temp;
                }
            }
        }
        bubbleSort(arr);
    }
}