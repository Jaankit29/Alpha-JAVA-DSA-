import java.util.*;

public class Anagram{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
       // sc.nextLine();
        String t=sc.nextLine();
        sc.close();

      System.out.println( solve(s,t)); 
    }

    public static boolean solve(String s, String t){
         if(s.length()!=t.length()) return false;

         int[] count=new int[58]; //A-Z =>65-90 || a-z => 97-122 || 122-65=57 || 57+1= 58

         for(char ch: s.toCharArray()){
            count[ch-65]++;
         }
         for(char ch: t.toCharArray()){
            count[ch-65]--;
         }

         for(int i: count){
            if(i!=0) return false;
         }


         return true;
    }
}