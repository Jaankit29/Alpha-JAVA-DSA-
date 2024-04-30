//package String;
import java.util.*;
import java.io.*;
import java.lang.*;
public class StringCompression {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        System.out.println(compress(s1));

    }

    public static String compress(String s){
        String res="";
        int n=s.length();

    for(int i=0; i<n; i++){
        int cnt=1;
        while(i<n-1 && s.charAt(i) == s.charAt(i+1)){
         cnt++;
         i++;
        }
        res +=s.charAt(i);
        if(cnt >1){
            res+= cnt.toString();
        }
          
        }
        return res;

    }
}
