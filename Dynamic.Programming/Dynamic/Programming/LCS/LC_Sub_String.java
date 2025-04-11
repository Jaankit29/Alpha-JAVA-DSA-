package LCS;
//Recursive
public class LC_Sub_String {
    public static void main(String[] args) {
       String s1= "ABCDGH";
       String s2="ACDGHR";
       int n=s1.length(), m=s2.length();

       System.out.println(LCString(s1, s2, n, m, 0));
        
    }
    public static int LCString(String s1, String s2, int n, int m, int count){
        if(n==0 || m==0){
            return count;
        }
        int max=count;
        if(s1.charAt(n-1)== s2.charAt(m-1)){
           max= LCString(s1,s2,n-1,m-1,count+1);
        }
        
        int opt1=LCString(s1,s2,n-1,m,0);
        int opt2=LCString(s1,s2,n,m-1,0);
        
        return Math.max(max, Math.max(opt1,opt2));
    }
}
//recursive T.C= O(2^min(n,m))

//Memorizatio
// T.C= O(n*m* min(n,m))  
//t[n][m][count]
