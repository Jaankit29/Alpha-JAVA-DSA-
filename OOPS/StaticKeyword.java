class Student{
    static int count=0;

    Student(){
        count++;
    }


    void subs(int a, int b){
         System.out.println(a-b);
    }

    static void sum(int a, int b){ //static method
        System.out.println(a+b);
    }

    static {
        System.out.println("I am a static block");
    }
}

class School{

    private static School sch= new School();

   private School(){
      // private constructor
    } 
    public static School getInstance(){
        return sch; 
    }



}

public class StaticKeyword {

    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new  Student();
        new Student();

        System.out.println(Student.count); // static int count=0
        Student.sum(2,4); // static method, direct access with class

        s1.subs(4,1); // access with object s1
       
        // System.out.println(s1.count);   int count=0;
        // System.out.println(s2.count);


       // School Sch new School(); // can not do this , because its constructor is private
          School skool = School.getInstance();
    }
}
