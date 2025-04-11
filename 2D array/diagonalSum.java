 import java.util.*;
 import java.io.*;
 import java.lang.*;
public class diagonalSum{
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n= sc.nextInt();
       int[][] matrix = new int[n][n];

       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          matrix[i][j]= sc.nextInt();
        }
       }

      //  for(int i=0; i<n; i++){
      //   for(int j=0; j<n; j++){
      //    System.out.print(matrix[i][j]+" ");
      //   }
      //  }

       int sum = 0;
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          if(i==j){
            sum+=matrix[i][j];
          }
         
        }
       }
      
       System.out.println(sum);
    }
  }
}

/*
 1 2 3 
 4 5 6 
 7 8 9
 */