//package String;

public class Stringbuilder {
    public static void main(String[] args){
        StringBuilder s1= new StringBuilder();
         for( char ch='a'; ch<'g'; ch++){
          // s1.append(ch);
          s1 +=ch;
         }

         System.out.println(s1);
    }
}
