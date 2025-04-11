package LCS;
//DP
public class LC_Sub_String_DP {
    public static void main(String[] args) {
        String s1= "ABCDGH";
       String s2="ACDGHR";
       int n=s1.length(), m=s2.length();
        int max=0;
        int t[][]=new int[n+1][m+1];
        
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
                else if(s1.charAt(i-1)== s2.charAt(j-1)){
                    t[i][j]= 1+t[i-1][j-1];
                    max= Math.max(max,t[i][j]);
                }
                
                else{
                    max= Math.max(max,t[i][j]);
                    t[i][j]=0;
                }
            }
        }
        System.out.println(max);
    }
}
//T.C= O(n*m)
