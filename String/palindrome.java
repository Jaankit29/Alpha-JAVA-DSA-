//package String;
import java.util.*;
import java.io.*;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(chackPalindrome(s1));
    }
    public static boolean chackPalindrome(String s){
        for(int i=0; i< s.length()/2; i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)) return false;
        }

        return true;
    }
}