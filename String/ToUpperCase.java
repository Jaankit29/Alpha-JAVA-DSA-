//package String;
import java.util.*;
public class ToUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s1= sc.nextLine();
       System.out.println(solve(s1));

      
     

    
    }
    public static String solve(String s){
        StringBuilder sb=new StringBuilder("");
       
        char ch= Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i=1; i<s.length(); i++){
          if(s.charAt(i) == ' ' && i< s.length()-1){
            sb.append(s.charAt(i));
            i++;
            sb.append(Character.toUpperCase(s.charAt(i)));
          }
          else{
            sb.append(s.charAt(i));
          }
        }
          return sb.toString();
    }
}
