public class minSubsetSumDiff {
    public static void main(String[] args) {
        int[] arr={1,2,7};
        int n=arr.length;
        System.out.println(minSubsetSumDifference(arr, n));
    }

    public static int minSubsetSumDifference(int []arr, int n) {
        // Write your code here.
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        //s1+s2=sum
        //s2=sum-s1
        //s2-s1=minimize(>=0) (s2>=s1)
        //sum-s1-s1 = sum-2*s1 =minimize  **
        //sum-2*s1>=0
        //2*s1<=sum 
        //s1<=sum/2  **

        boolean[][] dp= new boolean[n+1][sum+1];

        for(int i=0; i<=n; i++){
            dp[i][0]=true;
        }
        for(int i=1; i<=sum; i++){
            dp[0][i]=false;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j] ;
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        int min= Integer.MAX_VALUE;

        for(int i=0; i<=sum/2; i++){
            boolean s1=dp[n][i];
            if(s1==true){
                min= Math.min(min, sum-2*i);
            }
        }
        return min;
    }
}
