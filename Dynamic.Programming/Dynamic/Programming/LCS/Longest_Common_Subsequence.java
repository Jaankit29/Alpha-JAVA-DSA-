package LCS;

//recursive** + Memorization
public class Longest_Common_Subsequence {
    public static void main(String[] args) {
       String text1 ="abcde";
       String text2 ="ace";
       int n=text1.length();
       int m= text2.length();
       int[][] t=new int[n+1][m+1];
       for(int i=0; i<=n; i++){
        for(int j=0; j<=m; j++){
            t[i][j]=-1;
        }
       }
       System.out.println(LCS(text1, text2, n, m, t));
               
           }
       
        public static int LCS(String text1, String text2, int n, int m,int[][] t) {        
        if(n==0 || m==0){
            return 0;
        }
        else if(t[n-1][m-1]!=-1){
            return t[n-1][m-1];
        }
        else if(text1.charAt(n-1)== text2.charAt(m-1)){
            return t[n-1][m-1]= 1+ LCS(text1, text2, n-1, m-1, t);
        }
        else{
            return t[n-1][m-1]= Math.max(LCS(text1, text2, n, m-1, t), LCS(text1, text2, n-1, m, t));
        }
    }
}
