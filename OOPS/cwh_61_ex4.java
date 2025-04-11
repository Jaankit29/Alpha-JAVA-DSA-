

// You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books


class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }

    void addBooks(String book){
        this.books[no_of_books]= book;
        no_of_books++;
        System.out.println("\"" +book+ "\"" +" book has been added");

    }

    void showAvailableBooks(){
        System.out.println("Available books are:-");
        for(String book: this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"+ book);
        }
    }

    void issueBook(String book){
         for(int i=0; i<books.length; i++){
            if (books[i]==book) {
                System.out.println("\""+book+ "\"" +" this book has been issued from index "+i);
                books[i]=null;
                return;
            }
            
           
         }
         System.out.println("This book does not exist");
    }
}


public class cwh_61_ex4 {
    public static void main(String[] args) {
        
        Library L1=new Library();
        L1.addBooks("Rich and Poor dad");
        L1.addBooks("java");
        L1.addBooks("Python");
        L1.addBooks("C++");
        L1.addBooks("JS");
        L1.addBooks("React");
       L1.showAvailableBooks();
       L1.issueBook("Python");
       L1.showAvailableBooks();
       L1.issueBook("Python");

    }
}
