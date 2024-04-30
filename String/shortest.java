//package String;
import java.util.*;
import java.lang.*;

public class shortest {
     public static void main(String[] args){  
       //  System.out.println(expo(2));
        //   Scanner sc = new Scanner(System.in);
        //   String s1=sc.nextLine();
        //  System.out.println(solve(s1));
        // String s2="    an kit is a SE"   ;
        // System.out.println(s2.toLowerCase());
        // System.out.println(s2.toUpperCase());
        // System.out.println(s2.substring(2,7));
        // System.out.println(s2.trim());
        // System.out.println(s2);
        // String s3="ankit";
        // if(s2.equals(s3)){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("no");
        // }

        String[] fruits= {"apple", "mango", "banana", "A", "Y",  "Z"};
         String largest= fruits[0];
       //  System.out.println(largest.compareTo(fruits[1]));
         for(int i=1; i< fruits.length; i++){
             if(largest.compareToIgnoreCase(fruits[i])<0){
                   largest=fruits[i];
             }
         }
         System.out.println(largest);
     }

     public static float solve(String s){
        int n=s.length();
        int x=0, y=0;

        for(int i=0; i<n; i++){
            char ch= s.charAt(i);
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
     }

     public static int expo(int a){
        double p=Math.pow(a, 5);

        return (int)p;
     }
     
}
