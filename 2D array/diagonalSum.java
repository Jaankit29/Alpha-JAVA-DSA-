 import java.util.*;
 import java.io.*;
 import java.lang.*;
public class diagonalSum{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
   int n= sc.nextInt();
   int[][] matrix = new int[n][n];

   for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
      matrix[i][j]= sc.nextInt();
    }
   }
   int sum = 0;
   for(int i=0; i<n; i++){
     sum += matrix[i][i];

     if(i != n-i-1){
      sum+= matrix[i][n-i-1];
     }

   }
   System.out.println(sum);
  }
}