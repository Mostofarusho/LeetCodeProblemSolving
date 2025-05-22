// Create a Book class with title, author, and price. Create 3 objects and display their details.

public class BookChatGPT {
    String title;
    String author;
    int price;
    void displayInfo(){
        System.out.println("The name of the book is "+title+" Name of the author is "+author+" Book Price is "+price);
    }
    public static void main(String[] args) {
        BookChatGPT obj=new BookChatGPT();
        obj.title="Sei Somoy";
        obj.author="SG";
        obj.price=200;
        obj.displayInfo();
        BookChatGPT obj2=new BookChatGPT();
        obj2.title="Nil Nd";
        obj2.author="HA";
        obj2.price=250;
        obj2.displayInfo();
        BookChatGPT obj3=new BookChatGPT();
        obj3.title="Amader Desh";
        obj3.author="MYself";
        obj3.price=500;
        obj3.displayInfo();
    }
}
