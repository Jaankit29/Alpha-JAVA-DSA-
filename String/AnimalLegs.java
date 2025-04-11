import java.util.Scanner;

public class AnimalLegs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int L=sc.nextInt();
         
        int FL= (L-2*N)/2;
        int TL=N-FL;
        System.out.println("Two legs animal: "+TL);
        System.out.println("four legs animal: "+FL);
       
    }
}
