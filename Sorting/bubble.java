import java.io.*;
// package Sorting;

public class bubble {

    public static void main(String args[])
    {
        int arr[] = { 4,8,3,2,1 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    
    }
    
     public static void bubbleSort(int arr[], int n){
        // int i,j;
        boolean swapped=false;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            // if(swapped==false){
            //     break;
            // }

        }

     }

    // Function to print an array
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
 
}
