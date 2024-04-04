import java.util.*;
public class SearchInSortedArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] matrix= new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
              matrix[i][j]= sc.nextInt();
            }
           }
          
          System.out.println(search(matrix, 11));
    }
    public static boolean search(int[][] matrix, int k){
      int row=0, col=matrix[0].length-1;

       while (row< matrix.length && col >=0) {
          if(matrix[row][col]==k){
            return true;
          }
        else  if (k<matrix[row][col]) {
            col--;
          }
          else{
            row++;
          }
       }
      return false;
    }
}
