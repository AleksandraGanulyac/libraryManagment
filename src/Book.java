import java.util.ArrayList;

public class Book extends Literature{

    static final int storage = 30;

    static record book1(String name, String author, int year){};
    public static ArrayList<book1> books = new ArrayList<>();

    public static void add(String name, String author, int year){
        books.add(new book1(name, author, year));
    }
    public static void output(){
        for(book1 book:books){
            System.out.println("Название: " + book.name() + "|Автор: " + book.author() + "|Год написания: " + book.year() + "|Срок хранения: " + storage);
        }
    }
}
