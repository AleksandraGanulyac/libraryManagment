import java.util.ArrayList;

public class Literature {
    static record Literaturs(int id, String type, String name, String author, int year){};
    public static ArrayList<Literaturs> books = new ArrayList<>();

    public static void add(int id, String type, String name, String author, int year){
        books.add(new Literaturs(id, type, name, author, year));
    }

    public static void output(){
        for(Literaturs book: books){
            System.out.println("id: " + book.id() + "|Тип: " + book.type() + "|Название: " + book.name() + "|Автор: " + book.author() + "|Год написания: " + book.year());
        }
    }

    protected int storage = 1; //сколько можно держать у себя
    // Я не уверена еще насчет реализации id
    protected String name;
    protected String author;
    protected int year;
    protected String type;
}
