import java.util.*;
public class Parking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();

        int[][] mat=new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]=sc.nextInt();
            }
        }

        int max=-1;

        for(int i=0; i<row; i++){
            int temp=0;
            for(int j=0; j<col; j++){
                if(mat[i][j]==1){
                    temp++;
                }
            }
            if(temp>max){
                max=i;
            }
        }
      System.out.println(max);
    }
}
