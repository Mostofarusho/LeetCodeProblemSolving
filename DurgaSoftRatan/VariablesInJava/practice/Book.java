
public class Book {

    String title;
    String author;
    double price;
    int availableCopies;
    static String libraryName = "City Library";

    static {
      System.out.println("Well come To our "+Book.libraryName);
    }
    {
        System.out.println("There is a new reader come");
    }

    Book(String title, String author, double price, int availableCopies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    int borrowBook(int availableCopies) {
        this.availableCopies = this.availableCopies - availableCopies;
        return availableCopies;
    }

    int returnBook(int availableCopies) {
        this.availableCopies = this.availableCopies + availableCopies;
        return availableCopies;
    }

    void displayDetails() {
        System.out.println("Wellcome to our " + Book.libraryName);

        if (this.availableCopies > 0) {
            System.out.println("The Name of this book is " + title + " Author is " + author + " Price of this book is " + price + " The Number of available copy of this Book is " + this.availableCopies);
        } else {
            System.out.println("This book is not available");
        }

    }

    public static void main(String[] args) {
        Book obj1 = new Book("Ma", "Anisul Haque", 220.99, 2);
        obj1.borrowBook(1);
        obj1.returnBook(20);
        obj1.displayDetails();
        Book obj2=new Book("Sei Somoy", "Sunil Ganguly", 560.60, 2);
        obj2.returnBook(1);
        obj2.borrowBook(2);
        // obj2.borrowBook(15);
        obj2.displayDetails();
    }
}
