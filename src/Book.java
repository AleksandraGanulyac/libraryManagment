import java.util.HashMap;
import java.util.Map;

public class Book extends Literature{
    private boolean presence;
    final int storage = 30;

    public Book(String type, String name, String author, int year) {
        super(type, name, author, year);
        this.presence = true;

    }
    public Book(){}

   public static Map<Integer, Book> books = new HashMap<>();

    public static void add(int id, String type, String name, String author, int year){
        books.put(id, new Book(type, name, author, year));
    }

    @Override
    public void output(){
        for(Map.Entry<Integer, Book> entry:books.entrySet()){
            Integer ID = entry.getKey();
            Book book = entry.getValue();

            System.out.print("ID книги: " + ID + " | Название книги: " + getName() +
                    " | Автор книги: " + getAuthor() +  " | Год написания: " + getYear());
            if(book.presence == true){
                System.out.println(" | В наличии");
            }
            else{
                System.out.println("Нет в наличии");
                //Добавить дату начала
                //Дату окончания
            }
        }
    }
}
