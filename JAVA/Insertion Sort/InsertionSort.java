import java.io.*;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        
        insertion(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));

    }

    static void insertion(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                // Compare the current element with elements in the sorted part of the array
                if(arr[j]<arr[j-1]){
                    temp = arr[j]; // Store the current element to be inserted
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}