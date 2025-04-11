package LCS;

public class LCS_DP {
    public static void main(String[] args) {
        String text1 ="abcdelx";
       String text2 ="acetx";
       int n=text1.length();
       int m=text2.length();
       char[] res=new char[Math.max(n, m)];
       System.out.println(longestCommonSubsequence(text1, text2, res));
    }

    public static int longestCommonSubsequence(String text1, String text2, char[] res) {
        int n=text1.length();
        int m=text2.length();
        int[][] t= new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
              
              if(i==0 || j==0){
                t[i][j]=0;
              }
              else if(text1.charAt(i-1)==text2.charAt(j-1)){
                t[i][j]= 1+ t[i-1][j-1];
              }
              else{
                t[i][j]= Math.max(t[i-1][j], t[i][j-1]);
              }
            }
        }
      return t[n][m];
    }
}
