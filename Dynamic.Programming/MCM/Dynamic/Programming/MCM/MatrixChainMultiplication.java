import java.util.Scanner;

public class MatrixChainMultiplication {
    static int[][] t;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        t=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                t[i][j]=-1;
            }
        }
        System.out.println(mcm(arr, 1, n-1));
    }
    public static int mcm(int[] arr, int i, int j){
        if(i>=j){
            return 0;
        }
        int min= Integer.MAX_VALUE;

        if(t[i][j]!=-1){
            return t[i][j];
        }
        for(int k=i; k<j; k++){
            int temp= mcm(arr, i, k)+ mcm(arr, k+1, j)+
                        arr[i-1]*arr[k]*arr[j];

            if(temp<min){
                min=temp;
            }
        }

        return t[i][j]= min;
    }
}
