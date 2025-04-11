class insertionSort {

     public static void main(String args[]){
        int c=0;
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        for(int i=1; i<n; i++){
            int cur=arr[i];
            int j=i-1;
            while (j>=0 && cur<arr[j]) {
                c++;
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=cur;
        }

        printArray(arr, n);
        System.out.println(c);
     }

     static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}