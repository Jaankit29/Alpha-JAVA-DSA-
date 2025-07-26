public class LinkedList{
    class Node{
       int data;
       Node next;

       Node(int data){
         this.data=data;
         this.next=null;
       }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
      //step1
      Node newNode=new Node(data); 

      if(head==null){
        head=tail=newNode;
        return;
      }
      //step 2
      newNode.next=head;
      //step 3
      head=newNode;

    }

    public void addlast(int data){
      Node newNode=new Node(data);
      if (head==null) {
        head=tail=newNode;      
        return;
      }
      tail.next=newNode;
      tail=newNode;
    }

    public void print(){
      if (head==null) {
        System.out.println("LL is empty");
        return;
      }
      Node temp= head;
      while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
      }
    }
    public static void main(String[] args){
      LinkedList ll=new LinkedList();
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addlast(3);
      ll.addlast(4);
      ll.print();
    }

     
}