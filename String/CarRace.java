import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();

        if(n1>=n2) {
            System.out.println("-1");
        }
        else{
            System.out.println(x/(n2-n1)); // t= x/(n2-n1) , but if car move opposite derection (towards each other) then t= x/(n2+n1)
        }
    }
    
}
