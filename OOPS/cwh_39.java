// package OOPS;


class Employee{
     int salary;
     String name;

     public int getSalary(){
        return salary;
     }

     public String getName(){
        return name;
     }

     public void setName(String n){
        name=n;
     }

}

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int parameter(){
        return 4*side;
    }
}


public class cwh_39 {
    public static void main(String[] args) {
        // Employee harry= new Employee();
        // System.out.println(harry.getName());
        // harry.setName("ankit");
        // System.out.println(harry.getName());
           Square s1=new Square();
           s1.side=3;
           System.out.println(s1.area());
           System.out.println(s1.parameter());
    }
}
