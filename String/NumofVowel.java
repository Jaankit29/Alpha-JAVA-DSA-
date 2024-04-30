//package String;
import java.util.*;
import java.io.*;
import java.lang.*;
public class NumofVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        
        System.out.println(solve(s));
     
    }

    public static int solve(String s){
        int count=0;
        String s1=s.toLowerCase();
        for(int i=0; i< s.length(); i++){
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
}
 